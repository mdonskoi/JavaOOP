package Shape;


public class Main {

    public static void main(String[] args) {


        Triangle t = new Triangle();
        Shape t1 = new Triangle();
        Shape s = new Square(); // Почему не работает шейп

        t.setA(40.0);
        t.setB(30.0);
        t.setC(50.0);
        t.getSideA();
        t.area();

        t.perimeter();
        System.out.println("-------------------");

        t1.area();
        System.out.println(t1.area);

        s.perimeter();
        s.area();
    }

}
