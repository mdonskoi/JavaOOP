package Rectangle;

/**
 * Created by mikhail on 10/29/15.
 */
public class Rectangle {

    private int width, height;
    private static final String NAME = "Прямоугольник";

    public Rectangle() {

        width = 10;
        height = 5;
    }
    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    public static String getName(){
        return NAME;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int h){
        height = h;
    }
    public int getWidth(){
        return width;
    }
    public void setWidth(int w){
        width = w;
    }

    public void combine(Rectangle r){
        width += r.width;
        height += r.height;
    }
}


