package Exceptions;

import java.io.File;
import java.io.IOException;


public class NullPointerException {

    public static void createFile() throws IOException{

        File.createTempFile("ABc", "DEF", new File("/home/administrator/Рабочий стол/1"));
        System.out.println("File was created");
    }

    public static void main(String[] args) {
        try{

            createFile();

        }catch (IOException e){
            System.out.println("no path");
        }
    }

}
