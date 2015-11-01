package Rectangle;

/**
 * Created by Admin on 01.11.2015.
 */
public class RectangleDemo {

    public static void main(String args[]){

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(3, 2);

        System.out.println(Rectangle.getName());

        System.out.println("r1: " + r1.getHeight() + " x " +r1.getWidth());
        System.out.println("r2: " + r2.getHeight() + " x " +r2.getWidth());

        r2.setHeight(22);
        r2.setWidth(33);

        System.out.println("r2: " + r2.getHeight() + " x " +r2.getWidth());

        r1.combine(r2);
        System.out.println("r1: " + r1.getHeight() + " x " +r1.getWidth());

    }

}
