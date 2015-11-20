package PackageMover;


import java.io.*;

public class FileMover {

public void fileMover() {

    InputStream is = null;
    OutputStream os = null;



try {


    is = new FileInputStream("/Users/mikhail/1/Файлы, ввод-вывод - Занятие 7 - Java практика.mp4");

}catch (FileNotFoundException fnfe){
    System.out.println("File not found");
    return;
}

    try {
        os = new FileOutputStream("/Users/mikhail/2/Файлы, ввод-вывод - Занятие 7 - Java практика.mp4");

        int b;
        while ((b = is.read())!=-1){os.write(b);}


    }catch (Exception e){

        System.out.println("No directory");
       // e.printStackTrace();
    }



    finally {
        try {
            is.close();
        }catch (Exception e){
            System.out.println("Not closed");
        }
        try {
            os.close();
        }catch (NullPointerException e){
            System.out.println("NPE");
        }catch (Exception e){
            System.out.println("E");
        }
    }

}
}

