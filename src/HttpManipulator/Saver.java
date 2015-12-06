package HttpManipulator;


import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;


public class Saver {
    String link;
    String path;

    public Saver(String link, String path) {
        this.link = link;
        this.path = path;
    }

    public void start() throws IOException {
        URL url = new URL(link);
        HttpURLConnection http = (HttpURLConnection) url.openConnection();

        BufferedReader br = new BufferedReader(new InputStreamReader(http.getInputStream()));
        char[] buf = new char[1000];
        StringBuilder sb = new StringBuilder();
        ArrayList<String> list = new ArrayList<String>();

        int r;

        do {
            if ((r = br.read(buf)) > 0)
                sb.append(new String(buf, 0, r));
        } while (r > 0);

        StringBuilder sb1 = new StringBuilder();

        String s = sb.toString();

        System.out.println("Количество символов: " + s.length());

        if (s.indexOf("<a href=\"") != -1) {
            for (int l = 0; l < s.indexOf("<a href=\"", l); l++) {

                int i = s.indexOf("<a href=\"", l) + 9;
                while (s.charAt(i) != '"') {

                    sb1.append(s.charAt(i++));
                    l = sb1.length() + i;

                }

                list.add(sb1.toString());
                sb1.delete(0, Integer.MAX_VALUE);
            }
        } else {
            System.out.println("Ничего не нашло!");
        }

        System.out.println(list);

        System.out.println("Количество элементов: " + list.size());

//---------------------------------------------------------------------------------
         // Сохранение страниц в заданную папку на HDD
        for (String link : list) {

            try {

                File file = new File(path + link);
                byte[] b = s.getBytes();

                FileOutputStream out = new FileOutputStream(file);
                out.write(b);
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
