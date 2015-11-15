package Exceptions;

import java.io.IOException;

public class ArithmeticalException {
    static int z;
    public static void divide() /*throws IOException*/ {
        try{
            int x =1, y=0;
            z = x/y;

        }catch (ArithmeticException ex){
            System.out.println("Деление на 0!!!");
        }
    }

    public static void main(String[] args) {
        //ArithmeticalException a = new ArithmeticalException();
        divide();

    }
}
