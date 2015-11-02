package Autopark;

/**
 * Created by Admin on 02.11.2015.
 */
public class Autopark {

    public static void main(String[] args){

        AutoparkRemoteControl a = new AutoparkRemoteControl();

        a.setN(4);


        a.onCars(a.autoparkRemoteControl());

        a.offCars(a.autoparkRemoteControl());

    }



}
