package pkg03_parameter;

public class User {
	
	// 같은 클래스의 메소드 호출 : 메소드()
	
	// 메소드 호출시 전달되는 값 : 매개변수, Paramether
	void method1(int number) {
		System.out.println(number);
	}
	void method2(String str) {
		System.out.println(str);
	}
	void method3(double number) {
		method4(number);
	}
	void method4(double nunber) {
		System.out.println(nunber);
	}
	void method5(int[] arr) {
		for(int arrs : arr) {
			System.out.println(arrs);
		}
	}
	
	// 가변 매개변수 : 전달되는 인자 개수가 정해지지 않은 경우
	// 가변 매개변수는 사실 배열
	void method6(String... params) {
		for(int i = 0; i < params.length; i++) {
			System.out.println(params[i]);
		}
	}
	
}
