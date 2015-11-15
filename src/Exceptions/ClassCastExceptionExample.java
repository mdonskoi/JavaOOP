package Exceptions;


import Phone.Phone;

import java.util.Objects;

public class ClassCastExceptionExample {
    Object c = ('1');

    public void classCastExeptionCaller() throws ClassCastException {
        try {
            System.out.println((Byte) c);
        } catch (ClassCastException ce){
            System.out.println(ce.getMessage());

        }
    }

    public static void main(String[] args) {
        ClassCastExceptionExample classCastExceptionExample = new ClassCastExceptionExample();
        classCastExceptionExample.classCastExeptionCaller();
    }

}

