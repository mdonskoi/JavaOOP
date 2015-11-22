package PackageMover;


import java.io.*;

public class FileMover {

    String from;
    String to;

    long timeout = System.currentTimeMillis();

    public void fileMover(String from, String to) {

        InputStream is = null;
        OutputStream os = null;


        try {


            is = new FileInputStream(from);
            // for linux /home/administrator/Рабочий стол/Out/Урок 11 - Annotations, I-O, Properties - Java для тестировщиков.mp4

        } catch (FileNotFoundException fnfe) {
            System.out.println("File not found");
            return;
        }

        try {
            os = new FileOutputStream(to);
            // for linux /home/administrator/Рабочий стол/In/Урок 11 - Annotations, I-O, Properties - Java для тестировщиков.mp4

            int b;
            while ((b = is.read()) != -1) {
                os.write(b);
            }


        } catch (Exception e) {

            System.out.println("No directory");
            // e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (Exception e) {
                System.out.println("Not closed");
            }
            try {
                os.close();
            } catch (NullPointerException e) {
                System.out.println("NPE");
            } catch (Exception e) {
                System.out.println("E");
            }
        }
        System.out.println(System.currentTimeMillis() - timeout + " ms");
    }
}

