
package Phone;

import Phone.Nokia3310;

public class MainClass {

    public static void main(String[] args) {
        // Phone p = new Phone(); ������ �.�. ����� �����������

        Nokia3310 nokia = new Nokia3310();
        System.out.println("Nokia3310 screen size: " + nokia.getScreenSize());
        nokia.call("123-45-67");
        nokia.sendSMS("567-78-89", "text message");
        System.out.println("Call #: " + nokia.getCallCount(nokia));

        System.out.println("----------------------------------");

        IPhone iphone = new IPhone();
        System.out.println("IPhone screen size: " + iphone.getScreenSize());
        iphone.call("123-45-67");
        iphone.sendSMS("567-78-89", "text message");
        System.out.println("Call №: " + iphone.getCallCount(iphone));

        System.out.println("----------------------------------");


        IPhone5 iphone5 = new IPhone5();
        System.out.println("IPhone screen size: " + iphone5.getScreenSize());
        iphone5.call("123-45-67");
        iphone5.sendSMS("567-78-89", "text message");
        System.out.println("Call #: " + iphone5.getCallCount(iphone5));
        System.out.println("SMS #: " + iphone5.getSmsCount(iphone5));

        System.out.println("----------------------------------");

        SamsungS4 SamsungS4 = new SamsungS4();
        System.out.println("SamsungS4 screen size: " + SamsungS4.getScreenSize());
        SamsungS4.call("124-58-25");
        SamsungS4.call("124-58-25");
        SamsungS4.sendSMS("110-22-85", "I am a text message ");
        SamsungS4.sendSMS("110-233-96", "I am a text message 2 ");
        //System.out.println(SamsungS4.isHasWifi());

        System.out.println("Call #: " + SamsungS4.getCallCount(SamsungS4));
        System.out.println("SMS #: " + SamsungS4.getSmsCount(SamsungS4));


    }
}
