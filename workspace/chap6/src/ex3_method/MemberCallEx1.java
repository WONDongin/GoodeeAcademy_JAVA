package ex3_method;

public class MemberCallEx1 {
	// 객체화
	static int cv1 = 10;
	static int cv2 = cv1; 	// 클래스 멤버간 호출
	int iv1 = 100; 			// 상수값
	int iv2 = iv1; 			// 인스턴스 멤버간 호출
	int iv3 = cv1;       		// 인스턴스 멤버에서 클래스 멤버의 값을 호출
	// static int cv3 = iv1;   // 클래스 멤버에서 인스턴스 멤버의 값을 호출. 객체화 필요
	static int v3 = new MemberCallEx1().iv1;
	
	void method1() { // 인스턴스 멤버
		System.out.println("cv1 + cv2 +" + (cv1 + cv2)); // 클래스 멤버
		System.out.println("iv1 + iv2 +" + (iv1 + iv2));    // 인스턴스 멤버 
	}
	
	static void method2() { // 클래스 멤버
		System.out.println("cv1 + cv2 +" + (cv1 + cv2)); // 클래스 멤버
		// System.out.println("iv1 + iv2 +" + (iv1 + iv2));    // 인스턴스 멤버 호출 불가. 객체화 필요
		MemberCallEx1 m = new MemberCallEx1();
		System.out.println("iv1 + iv2 +" + (m.iv1 + m. iv2));
	}
	
	void method3() { // 인스턴스 멤버
		method1();  method2();
	}
	
	static void method4() { // 클래스 멤버
		// method1();   // 인스턴스 멤버 호출불가. 객체화 필요
		new MemberCallEx1().method1();
		method2();
	}
	
	public static void main(String[] args) {
		// method1 ~ method4 함수 호출
		MemberCallEx1 mc = new MemberCallEx1();
		mc.method1();
		MemberCallEx1.method2(); // main 함수와 같은 멤버
		mc.method3();
		method4();
	}
}
