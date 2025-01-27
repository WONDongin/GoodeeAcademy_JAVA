package pkg02_interface;

// 추상 클래스 : abstract class
// 인터페이스 : interface

public interface  MemberServicce {

	// 추상 메서드
	public abstract void logIn();
	public abstract void logOut();
	
	// default 메서드
	public default void method1() {
		System.out.println("default 메소드");
	}
	
	// 정적 메소드
	public static void method2() {
		System.out.println("static 메소드");
	}
	
	
}
