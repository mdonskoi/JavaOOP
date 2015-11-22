package FileMover;

import org.apache.commons.io.IOUtils;


import java.io.*;


public class PackageMover {
//    File f1 = new File("/home/administrator/Рабочий стол/Out/Безымянная папка/Урок 11 - Annotations, I-O, Properties - Java для тестировщиков.mp4");
//    File f2 = new File("/home/administrator/Рабочий стол/In/Безымянная папка/Урок 11 - Annotations, I-O, Properties - Java для тестировщиков.mp4");

    InputStream is;
    OutputStream os;

    public void packageMover() {

        try {
            is = new FileInputStream("/home/administrator/Рабочий стол/Out/Безымянная папка/Урок 11 - Annotations, I-O, Properties - Java для тестировщиков.mp4");

        } catch (Exception fnfe) {
            System.out.println("File not found");
            try {
                os = new FileOutputStream("/home/administrator/Рабочий стол/In/Безымянная папка/Урок 11 - Annotations, I-O, Properties - Java для тестировщиков.mp4");
            } catch (Exception dnf) {
                System.out.println("Dir is not found");
            }
            try {

                IOUtils.copy(is, os);
            } catch (Exception e) {
                System.out.println("IOUtils failed");
            } finally {
                IOUtils.closeQuietly(is);
                IOUtils.closeQuietly(os);
            }

        }

    }
}
