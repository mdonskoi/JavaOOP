package Phone;

public abstract class Phone {

	int callCount = 0;
	int smsCount = 0;
	
	protected boolean touch;
	protected boolean hasWifi;
	protected int screenSize;
	
	public Phone() {
		System.out.println("Phone constructor");
	}
	
	public boolean isTouch() {
		return touch;
	}
	
	public boolean isHasWifi() {
		return hasWifi;
	}
	
	public int getScreenSize() {
		return screenSize;
	}
	
	public void call(String number) {
		System.out.println("Phone class is calling " + number);
		callCount++;
	}

	public int getCallCount(Phone phone){
		return callCount;
	}


	public abstract void sendSMS(String number, String message);


    public int getSmsCount(){

        return smsCount++;
    }
}
