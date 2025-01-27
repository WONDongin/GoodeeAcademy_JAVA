package pkg03_static;

public class Calculator {

	// 정적 멤버
	// 클래스를 이용해서 호출하는 멤버, 인스턴스(객체) 생성 없이 호출하는 멤버
	
	// 클래스 영역 -> 스택영역 -> 힙 영역
	// 클래스 로드      변수              new(배열, 인스턴스)
	// 정적 멤버
	
	// field
	public static final String MAKER = "SSEUL";
	
	
	public static void  add(int a, int b) {
		System.out.println(a + "+" + b + "=" + (a+b));
	}
	
}
