package Autopark;

/**
 * Created by Admin on 02.11.2015.
 */
public class Car {

   public int speed = 100;

    public void on(){
        System.out.println("Engine was turned on");
    }

    public void off(){
        System.out.println("Engine was turned off");
    }

    public void go(){
        System.out.println("Car is driving" + speed);
    }

//    public void setSpeed(int speed) {
//        this.speed = speed;
//    }
}
