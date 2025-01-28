package pkg03_throws;

public class Calculator {
	
	// throws : 메소드에서 발생한 예외를 메소드를 호출한 곳으로 던지는 것
	
	public void calculate(int a, int b) throws ArithmeticException {
		System.out.println(a +b);
		System.out.println(a -b);
		System.out.println(a *b);
		System.out.println(a /b); // 오류발생지점
		System.out.println(a %b);
	}
}
