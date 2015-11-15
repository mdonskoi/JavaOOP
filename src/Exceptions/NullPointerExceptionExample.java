package Exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.NullPointerException;


public class NullPointerExceptionExample {

    private int counter;
    public static void createFile() throws IOException{

        File.createTempFile("ABc", "DEF", new File("/home/administrator/Рабочий стол/1"));
        System.out.println("File was created");
        System.out.println("-------------------------------");
    }

    public void readFile() throws NullPointerException {


        try {

            BufferedReader reader = new BufferedReader(new FileReader("/home/administrator/Рабочий стол/1/2.txt"));
            String line;
            System.out.println("Reading file...");
            System.out.println("File text is: ");

            long timeout = System.currentTimeMillis();


            while ((line = reader.readLine()) != null){
                System.out.println(line);
                counter++;
            } System.out.println(counter + " lines");
            System.out.print("Working time is: ");
            System.out.println(System.currentTimeMillis() - timeout + " ms");



        }catch (Exception ne){
            System.out.println(ne.getMessage());
        }

    }

    public static void main(String[] args) {
        try{

            createFile();

        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        NullPointerExceptionExample nullPointerExceptionExample = new NullPointerExceptionExample();
        nullPointerExceptionExample.readFile();
    }

}
