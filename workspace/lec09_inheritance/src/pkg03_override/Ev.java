package pkg03_override;

public class Ev extends Car {
	
	private int battery;

	public Ev(String model, int battery) {
		super(model);
		this.battery = battery;
	}
	
	// 부모 클래스의 메소드를 자식 클래스는 사용할 수 있다.
	// 원한다면 부모클래스의 메소드도 다시 만들어 사용할 수 있다.
	
	@Override
	public void forward() {
		System.out.println("전기차 앞으로");
	}
	@Override
	public void reverse() {
		System.out.println("전기차 뒤로");

	}
	
	
}
