package Exceptions;

import java.io.File;
import java.io.IOException;


public class NullPointerException {

    public static void createFile() throws IOException{

        File.createTempFile("ABC", "DEF", "/Users/mikhail");
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
