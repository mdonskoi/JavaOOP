package Exceptions;

import java.io.IOException;

/**
 * Created by mikhail on 11/12/15.
 */
public class ArithmeticalException {
    public static void divide() /*throws IOException*/ {
        try{
            int x =1, y=0;
            int z=x/y;

        }catch (ArithmeticException ex){
            System.out.println("Деление на 0!!!");
        }
    }

    public static void main(String[] args) {
        divide();
    }
}
