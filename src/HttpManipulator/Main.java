package HttpManipulator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input link: ");
        String read = br.readLine();
        // prog.kiev.ua/

        System.out.println("Save in: ");
        String path = br.readLine();
        // /home/administrator/Рабочий стол/In/HtmlSaver/

        Saver sv = new Saver("http://" + read, path);

        sv.start();
    }

}
