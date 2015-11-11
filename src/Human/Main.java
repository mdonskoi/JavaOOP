package Human;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Human[] list = {
                new Human(40), new Human(20), new Human(3),
                new Human(7)};
        Arrays.sort(list);

      //  for (int i = list.length; i == 0; i--) {

           // Human h = list[];
            for (Human h : list)
            System.out.println(h.getAge());
        }
    }


