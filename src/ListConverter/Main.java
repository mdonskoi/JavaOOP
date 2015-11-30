package ListConverter;

import java.lang.reflect.Array;
import java.util.List;


public class Main {



    public static void main(String[] args) {

        Integer [] a = {1, 2, 3, 4, 5};
        String[] d = {"fed", "wefewr", "eqwfewf", " wefgwreg"};





        ArrayToListConverter arr = new ArrayToListConverter();
        arr.arrayToListConverter(d);
        arr.arrayToListConverter(a);




    }

    void copy(List<String> src, List<String> dest){
        for (String d : src){
            dest.add(d);
        }
    }



}