package ex5_constructor;
/*
 	생성자 오버로딩 예제
 	- 클래스내부에 매개변수 목록이 다른 생성자가 여러개 존재 가능함
 */
public class ConstructorEx2 {
	public static void main(String[] args) {
		Car c1 = new Car("Blue", 5678);
		Car c2 = new Car("Red");
		Car c3 = new Car(04321);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}
}
