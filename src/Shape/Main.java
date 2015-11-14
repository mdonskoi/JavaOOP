package Shape;

/**
 * Created by mikhail on 11/10/15.
 */
public class Main {

    public static void main(String[] args){
        Triangle t = new Triangle();
        Square s = new Square(); // Почему не работает шейп

        t.setA(40.0);
        t.setB(30.0);
        t.setC(50.0);
        t.area();
        t.perimeter();
        System.out.println("-------------------");
        s.setA(10);
        s.perimeter();
        s.area();
    }

}
