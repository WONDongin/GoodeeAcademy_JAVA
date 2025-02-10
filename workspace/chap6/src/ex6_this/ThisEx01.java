package ex6_this;
/*
 	this 예약어
 	this 참조변수 : 자기참조변수
 	- 현재 객체의 참조값을 저장
 	- 인스턴스 메서드에서 지역변수로 선언되고, 객체 생성시 자기 참조값을 저장
 	- 지역변수와 멤버변수 구분시 사용함.
 	- 지역변수의 이름과 멤버변수 이름이 같은 경우 지역변수 우선.
 	 => this 참조변수를 이용하여 멤버변수를 호출할 수 있음
 	 
 	 - 지역변수의 이름과 멤버 변수 이름이 다른경우
 	 => 멤버변수 호출시 this 생략 가능함.
 	
 	 	
 	this() 생성자 : 동일한 클래스의 다른 생성자를 호출시 사용함.
 	- 반드시 첫줄에 구현해야 함.
 */
public class ThisEx01 {
	public static void main(String[] args) {
		Car c1 = new Car("Blue", 1234); // 지역변수
		Car c2 = new Car();
		System.out.println(c1);
		System.out.println(c2);
		
		Car c3 = new Car("Red");
		System.out.println(c3); // 3번 자동차: Red, 1111
		Car c4 = new Car(1234);
		System.out.println(c4); // 4번 자동차: White, 1234
		Car c5 = new Car(c1);
		System.out.println(c5); // 5번 자동차: Blue, 1234
	}
}
