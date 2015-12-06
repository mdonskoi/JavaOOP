package HttpManipulator;
import java.io.*;
import java.net.*;
import java.util.*;


//Разобрать

public class WebPageDownloader
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = listUrl(getContentPageSite(url));
        createWebPage(list);
    }
    /**
     *  Названия сайта с которого будем скачивать ссылки
     *  Путь к папке на диске, для скачивания файлов
     */
    public static String url = "http://hello.com/";
    public static String PATH_TO_FILE = "/home/administrator/Рабочий стол/In/HtmlSaver/";
    /**
     *  Метод который возвращает содержимое веб - страницы ввиде строки
     */
    public static String getContentPageSite(String urlSite)
    {
        StringBuilder sb = new StringBuilder();
        try
        {
            URL url = new URL(urlSite);
            HttpURLConnection http = (HttpURLConnection) url.openConnection();

            BufferedReader br = new BufferedReader(new 	InputStreamReader(http.getInputStream()));
            char[] buf = new char[1000];
            int r;
            do
            {
                if ((r = br.read(buf)) > 0)
                    sb.append(new String(buf, 0, r));
            }
            while (r > 0);
            http.disconnect();
        }
        catch(Exception e){}
        return sb.toString();
    }
    /**
     *  Метод который возвращает список link с веб страницы
     */
    public static ArrayList<String> listUrl(String page)
    {
        /**
         * start,end - переменные для номера символов, начала и конца ссылки
         * buildPage - билдер для формирования строчки
         * link - переменная для ссылки
         * list - контейнер для ссылок
         */
        int start,end;
        StringBuilder buildPage = new StringBuilder();
        String link = "";
        ArrayList<String> list = new ArrayList<String>();
        /**
         * Проверяем в цыкле есть ли ссылки
         * если есть, то мы их вырезаем и добавляем в список
         */
        while(page.indexOf("<a href=\"") != -1)
        {
            start = page.indexOf("<a href=\"") + 9;
            end = page.indexOf("\"", start);
            link = page.substring(start, end);
            list.add(link);
            /** Каждый раз ощищаем buildPage,чтоб содержимое не нагромождалось*/
            buildPage.delete(0, buildPage.length());
            buildPage.append(page);
            /** Удаляем с buildPage тег <a href="">*/
            buildPage.delete(start-9, end+1);
            /** Формируем новую страничку, но уже без одной ссылки*/
            page = buildPage.toString();
        }

        return list;
    }
    /** Метод который создает файлы на жестком диске
     *  поскольку содержимое у нас в основном в html, то я решил в конец файла дописывать html(можно и без этого)
     *  некоорые файлы итак приходят как html
     */
    public static void createWebPage(ArrayList<String> listUrl)
    {
        for (String link : listUrl)
        {
            /** Формируем правильное название файла*/
            String correctNameFile = getLinkForFile(link);
            try
            {
                File file = new File(PATH_TO_FILE+"/"+correctNameFile+".html");
                FileWriter fw = new FileWriter(file);
                /** Если к нам пришел файл не с расширением html,php,jsp
                 *  а просто какая-то ссылка, то мы сразу ее передаем для сохранения
                 */
                if(!isFileOur(correctNameFile)){
                    fw.write(getContentPageSite(link));
                }
                fw.write(getContentPageSite(url+"/"+correctNameFile));
                fw.close();
            }catch(Exception e){}
        }
    }
    /**
     *  Метод который возвращает правильное наименование для файла
     */
    public static String getLinkForFile(String link)
    {
        /** Если ссылка начинается с http://, мы ее обрезаем */
        int index = link.indexOf("http://");
        if (index == 0) {
            link = link.substring(7);
        }
        /** Если в ссылке есть  "/", мы их заменяем на "_" */
        if (link.indexOf("/") != -1) {
            link = link.replaceAll("/", "_");
        }
        return link;
    }
    /** Метод фильтрует файлы по расширению */
    public static boolean isFileOur(String nameFile)
    {
        /**    Масив суфиксов    **/
        String [] mas = new String[]{"html","php","jsp"};
        /**   Номер последней точки в строке    **/
        int sufix = nameFile.lastIndexOf(".");
        /**    Отрезаем часть строки и оставляем расширение     **/
        String endFile = nameFile.substring(sufix+1);
        /**     Проходим в цикле проверку   **/
        for (int i = 0; i < mas.length; i++)
        {
            if(mas[i].equals(endFile))
            {
                return true;
            }
        }
        return false;
    }
}

