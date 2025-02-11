package ex4_binding;
/*
 * 부모타입의 객체를 자손타입의 참조변수로 참조불가 : ClassCastException 예외 발생
 * instanceof 연산자 : 객체와 참조변수의 관계 리턴
 */
public class BindingEx3 {
	public static void main(String[] args) {
//		Bike b = new Bike(2);
		Bike b = new AutoBike(2);
		AutoBike ab = null;
		Object o = null;
		if(b instanceof AutoBike) {
			ab = (AutoBike)b;
			System.out.println("ab 참조변수가 참조하는 객체는 AutoBike 객체임");
			System.out.println(ab.wheel);
			System.out.println(ab.power);
			ab.drive();
			ab.stop();
			ab.power();
		}
		if(b instanceof Bike) {
			System.out.println("b 참조변수가 참조하는 객체는 Bike 객체임");
			System.out.println(b.wheel);
			// System.out.println(b.power);
			b.drive();
			b.stop();
			// b.power();
		}
		if(b instanceof Object) {
			o = b;
			System.out.println("o 참조변수가 참조하는 객체는 Object 객체임");
			//System.out.println(o.wheel);
			//System.out.println(o.power);
			//o.drive();
			//o.stop();
			//o.power();
		}
	}
}