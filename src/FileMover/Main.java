package FileMover;




public class Main {



    public static void main(String[] args) {
        //String from = "/home/administrator/Рабочий стол/Out/Урок 11 - Annotations, I-O, Properties - Java для тестировщиков.mp4";
       // String to = "/home/administrator/Рабочий стол/In/Урок 11 - Annotations, I-O, Properties - Java для тестировщиков.mp4";

        String from = "/home/administrator/Рабочий стол/Out/Антитела - Смотри в меня (original).mp3";
        String to = "/home/administrator/Рабочий стол/In/Антитела - Смотри в меня (original).mp3";

        FileMover f = new FileMover();

        PackageMover p = new PackageMover();

        // For Mac
    //  f.fileMover("/Users/mikhail/1/Файлы, ввод-вывод - Занятие 7 - Java практика.mp4",
     //           "/Users/mikhail/2/Файлы, ввод-вывод - Занятие 7 - Java практика.mp4");

        p.packageMover();

        // For linux
     f.fileMover(from,to);

    }


}
