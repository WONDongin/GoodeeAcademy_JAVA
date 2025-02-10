package ex01_is_a;
/*
 	[상속 예제]
 	1. 자손 클래스의 객체 생성은 -> 부모 클래스의 객체부터 생성한다.
 	2. 클래스 간의 상속은 단일 상속(부모 1개)만 가능한다.
 	- 현재 클래스의 부모클래스는 한개만 가능하다.
 	3. 모든 클래스의 부모클래스 (Object)
 	
 */

public class PhoneEx01 extends Object {
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		// 자손 객체
			// 부모 객체
		sp.power();
		sp.send();
		sp.receive();
		sp.setApp("카카오"); 
		
	}
}
