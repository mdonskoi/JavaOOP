package Exceptions;

import java.io.File;
import java.io.IOException;

/**
 * Created by mikhail on 11/12/15.
 */
public class IoException {
    public static void test() throws IOException {
        File f = File.createTempFile("ABC", "DEF");
        System.out.println(f.getCanonicalPath());
    }

    public static void main(String[] args) {
        try {
            test();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
