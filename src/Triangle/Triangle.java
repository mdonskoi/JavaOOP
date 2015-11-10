package Triangle;

/**
 * Created by mikhail on 11/10/15.
 */
public class Triangle {
    public double a;
    public double b;
    public double c;
    public double s;

    public void triangleArea(double a, double b, double c){

        this.a = a;
        this.b = b;
        this.c = c;

        double p = (a+b+c)/2;

        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));

       // System.out.println("Triangle area is: " + s);
    }
}
