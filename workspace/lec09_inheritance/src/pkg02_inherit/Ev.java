package pkg02_inherit;

public class Ev extends Car {

	// 부모 클래스가 생성자를 가진 경우에는
	// 자식 클래스의 생서자에서 부모 클래스의 생성자를 반드시 '먼저' 호출해야 한다.
	
	private int battery;
	

	public Ev(String model, int battery) {
		super(model); // Car(String model) 생성자가 호출한다.
		this.battery = battery;
	}


	public int getBattery() {
		return battery;
	}


	public void setBattery(int battery) {
		this.battery = battery;
	}
	
	
}
