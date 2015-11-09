package Phone;


import java.util.Scanner;

public class SamsungS4 extends Phone {

    public SamsungS4() {
        System.out.println("SamsungS4 constructor");

        touch = true;
        hasWifi = true;
        screenSize = 5;
    }

//    @Override
//    public boolean isHasWifi() {
//        return true;
//
//    }
//
//    public int getScreenSize(){
//       return screenSize = 5;
//    }

    public void sendSMS(String number, String message){

        System.out.println(message + "Hello");

    }

}
