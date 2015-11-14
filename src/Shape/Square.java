package Shape;

/**
 * Created by administrator on 14.11.15.
 */
public class Square extends Shape {
    double a;

    public void perimeter(){
        System.out.println("Perimeter of square is: " + a*4);}

    public void area(){
        System.out.println("Square area is: " + a*a);
    }

    public void setA(double a) {
        this.a = a;
    }
}

