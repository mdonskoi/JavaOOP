package Autopark;

/**
 * Created by Admin on 02.11.2015.
 */
public class AutoparkRemoteControl {

    public static int N;


    public void setN(int N) {
        this.N = N;
   }

    public  Car[] autoparkRemoteControl() {


            Car[] cars = new Car[N];
            for (int i = 0; i < N; i++) {
                cars[i] = new Car();
            }
            return cars;
        }



    public Car[] onCars(Car[] cars) {
        for (int i = 0; i < N; i++) {
            cars[i].on();
        }
        return cars;
    }

    public void offCars(Car[] cars){
        for (int i = 0; i < N; i++){
            cars[i].off();
        }
    }

}
