package Exceptions;

import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

import java.lang.reflect.Array;
import java.util.InputMismatchException;
import java.util.Scanner;


public class IndexOutOfBoundsExceptionExample {
    static int[] array = {1, 2, 3, 4, 5};
    private static int i;

    public static void arrayItemViewer() throws java.lang.IndexOutOfBoundsException {
        System.out.println("Input index");
        Scanner scanner = new Scanner(System.in);

        try {
            i = scanner.nextInt();
        } catch (InputMismatchException me) {
            System.out.println("Input only digits"); //почему выводит 1?
        }

        try {
            System.out.println(array[i]);
        } catch (Exception ex) {
            System.out.print("There is no: ");
            System.out.print(i);
            System.out.println(" index, input another");

        }

    }

    public static void main(String[] args) {

        arrayItemViewer();

    }

}

