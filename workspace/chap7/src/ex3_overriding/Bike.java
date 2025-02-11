package ex3_overriding;

public class Bike {
	int wheel;
	Bike(int wheel) {
		this.wheel = wheel;
	}
	String drive() {
		return "패달을 밟는다";
	}
	String stop() {
		return "브레이크를 잡는다";
	}
}
class AutoBike extends Bike {
	boolean power;
	AutoBike(int wheel) {
		super(wheel);
	}
	void power() {
		power = !power;
	}	
	@Override //오버라이딩된 메서드여부 판별 어노테이션
	String drive() {
		return "출발버튼을 누른다";
	}
	
}