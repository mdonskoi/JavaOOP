package Shape;

/**
 * Created by mikhail on 11/10/15.
 */
public class Triangle extends Shape {

       //public Triangle(){}
    public double a;
    public double b;
    public double c;
    //public double s;

    public void perimeter(){
        double p = (a+b+c)/2;
        System.out.println("Triangle perimeter is: " + p);
    }

    public void area(){

        double p = (a+b+c)/2;

        try {
            area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }catch (ArithmeticException e){e.getMessage();}

        System.out.println("Triangle area is: " + area);

    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }
}
