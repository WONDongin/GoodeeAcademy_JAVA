package ex5_constructor;
/*
 	생성자란?
 	- 객체화시 호출되는 메서드.
 	- 생성자 없는 객체 생성은 불가능.
 	- 생성자의 주요 기능은 인스턴스변수 초기화를 담당함
 	- 클래스 내부에 생성자를 구현하지 않으면 기본 생성자 제공함.
 	- 생성자 오버 로딩이 가능함
 	
 	
 	[기본생성자]
 		public 클래스명(){} => 이런 형식임
 		
 */
public class ConstructorEx1 {
	public static void main(String[] args) {
		Number1 n1 = new Number1(); // Number1()  생성자
		/*
		 new 예약어 기능
		 1. 메모리 할당. 힙영역에 할당
		 2. 멤버필드들의 값을 기본값으로 초괴화. 명시적으로 초기화된경우 초기화 값으로 초기화
		 3. 생성자 호출
		 */
		Number2 n2 = new Number2(10);
		System.out.println(n1.num); // 0
		System.out.println(n2.num); // 10
	}
}
