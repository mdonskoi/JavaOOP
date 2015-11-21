package SortArray;


import java.util.Random;
import java.util.Arrays;

public class SortArray {


    public void generator() throws OutOfMemoryError {


        Random random = new Random();

        int[] cats;
        int s = random.nextInt(150);
        cats = new int[s];
        long timeout = System.currentTimeMillis();
        for (int z = 0; z < cats.length; z++) {

            cats[z] = random.nextInt(1000);
        }

        System.out.print("Unsorted Array: ");

        for (int i = 0; i < cats.length; i++) {

            System.out.print(cats[i]);
            System.out.print(", ");
        }
        System.out.println();

        System.out.print("Sorted Array: ");

        Arrays.sort(cats);
        for (int i = 0; i < cats.length; i++) {

            System.out.print(cats[i]);
            System.out.print(", ");
        }
        System.out.println();
        System.out.println("------------------------");
        System.out.println(System.currentTimeMillis() - timeout + " ms");
        System.out.println(cats.length + " array cells");
        System.out.println();
    }

    public static void main(String[] args) {
        SortArray s = new SortArray();

        for (int i = 1; i < 10
                ; i++) {

            try {
                s.generator();
            } catch (OutOfMemoryError oe) {
                System.out.println("Low memory | " + oe.getMessage());
            }
        }

    }

}

