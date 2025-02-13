package chap9;
/*
내부 클래스 : 클래스 내부에 존재하는 클래스
인스턴스 내부클래스 : 객체화가 되기 위해서는 외부 클래스의 객체화 필요
								  외부클래스의 참조변수명.new 내부 클래스명()
								  new 외부클래스명.new 내부클래스

static 내부클래스 : 객체화가 되기 위해서는 new 외부클래스명.내부클래스명()
지역 내부클래스 : 메서드 내부에서 선언된 내부클래스
              내부 클래스를 선언한 메서드 내에서만 사용 가능

내부클래스 특징
1. 참조자료형으로 사용됨, 외부클래스명.내부클래스명
2. 객체화 가능, Object 클래스의 하위 클래스
3. 멤버소유가능, 생성자 구현 가능

외부클래스의 멤버이다.
1. 외부클래스의 private 멤버에 접근 가능
2. 인스턴스내부 클래스 : 인스턴스멤버
3. staitc내부 클래스 : 클래스멤버
*/
class Outer1 {
	// 인스턴스 내부 클래스
	class InstanceInner {
		int iv = 100;
		static int cv = 10;
		final static int MAX = 200;
	}
	// static 내부 클래스
	static class StaticInner {
		int iv = 300;
		static int cv = 400;
		final static int MAX = 500;
	}
	// Outer1 클래스의 멤버
	void method() {
		// local 내부 클래스, method() 메서드 내부에서만 호출 가능
		class LocalInner{
			int iv = 600;
			static int cv = 700;
			final static int MAX = 800;
		}
		LocalInner lc = new LocalInner(); // 객체화
		System.out.println("lc.iv" + lc.iv);
		System.out.println("lc.cv" + lc.cv);
		System.out.println("LocalInner.cv" + LocalInner.cv);
	}
	void method2() {
		// LocalInner lc = new LocalInner(); // 오류발생, method 내부에서만 호출가능한 내부 클래스
	}
}
public class InnerEx1 {
	public static void main(String[] args) {
		Outer1 out = new Outer1();
		out.method();
		// InstanceInner class 객체화
		// Outer1.InstanceInner instanceInner = new Outer1.InstanceInner(); // 오류발생
		 Outer1.InstanceInner ii = new Outer1().new InstanceInner(); // 외부클래스의 객체화 필요
		// Outer1.InstanceInner ii = out.new InstanceInner(); // 축약
		
		// StaticInner class 객체화
		Outer1.StaticInner si = new Outer1.StaticInner();
		// Outer1.StaticInner si = out.new StaticInner() // 오류
		
		// ii 객체의 멤버 호출
		System.out.println("ii.iv=" + ii.iv); // 인스턴스 변수
		System.out.println("ii.cv=" + ii.cv);
		System.out.println("Outer1.InstanceInner.cv=" + Outer1.InstanceInner.cv);
		System.out.println("Outer1.InstanceInner.MAX=" + Outer1.InstanceInner.MAX);
		
		// si 객체의 멤버 호출
		System.out.println("si.iv=" + ii.iv);
		System.out.println("Outer1.StaticInner.cv=" + Outer1.StaticInner.cv);
		System.out.println("Outer1.StaticInner.MAX=" + Outer1.StaticInner.MAX);
	}
}
