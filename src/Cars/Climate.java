package Cars;

public class Climate {
	private boolean on;
	private int temperature;
	
	public Climate() {
		temperature = 20; // ��������
	}
	
	public void turnOn() {
		on = true;
	}
	
	public void turnOff() {
		on = false;
	}
	
	public boolean isOn() {
		return on;
	}
	
	public int getTemperature() {
		return temperature;
	}
	
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
}
