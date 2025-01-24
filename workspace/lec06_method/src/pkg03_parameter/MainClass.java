package pkg03_parameter;

public class MainClass {
	public static void main(String[] args) {
		// User 클래스 타입의 user 객체 생성
		User user = new User();
		
		// 다른 클래스의 메소드 호출 : 객체.메소드
		// 메소드 호출시 전달하는 값 : 인자, 인수, Argument 
		user.method1(10);
		user.method2("hello");
		user.method3(1.5);
		user.method5(new int[] {10, 20, 30});
		user.method6("고양이", "강아지");
		user.method6("사과", "배", "복숭아");
		
	}
}
