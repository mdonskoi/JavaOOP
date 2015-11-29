package Human;

import java.util.Arrays;

public class MainHuman {
    public static void main(String[] args) {
        Human[] list = {
                new Human(40), new Human(20), new Human(3),
                new Human(7), new Human(30)};
        Arrays.sort(list);

        //  for (int i = list.length; i == 0; i--) {

        // Human h = list[];
        for (Human h : list)
            System.out.println(h.getAge());

        String s = Human.class.toString();
        System.out.println(s.hashCode());
        System.out.println(Human.class.hashCode());
        System.out.println(Human.class.hashCode());
        System.out.println(s);
    }


}


