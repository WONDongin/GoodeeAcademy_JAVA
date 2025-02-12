package ex4_binding;
/*
 * 1. 자손타입의 객체는 부모타입의 참조변수로 참조가 가능하다.
 * 2. 부모타입의 멤버와, 자손타입의 멤버 다를경우
 *    부모타입의 참조변수로 자손타입의 객체를 참조시, 부모타입의 멤버만 호출가능
 * 3. 모든 클래스의 객체는 Object타입의 참조변수로 참조가 가능하다.
 *    Object 타입으로 참조된 객체는 Object 멤버만 호출이 가능하다.   
 */
class Bike {
	int wheel;
	Bike(int wheel) {
		this.wheel = wheel;
	}
	void drive() {
		System.out.println("패달을 밟는다");
	}
	void stop() {
		System.out.println("브레이크를 잡는다");
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
}
public class BindingEx2 {
	public static void main(String[] args) {
		AutoBike ab = new AutoBike(2);
		System.out.println("바퀴수:" + ab.wheel);
		ab.power();
		ab.drive();
		ab.stop();
		Bike b = ab;
		System.out.println("바퀴수:" + b.wheel);
//		b.power();  //AutoBike 클래스 멤버. Bike 타입의 참조변수로는 호출못함
		b.drive();
		b.stop();
		Object o = b;
		//Bike 타입의 멤버임. Object 타입의 참조변수로는 호출안됨
//		System.out.println("바퀴수:" + o.wheel); 
//		o.power();
//		o.drive();
//		o.stop();
		
		// 2
	}
}