package ex6_final;
/*
 * final : 변경 불가. 
 * final method : 재정의 불가. 
 */
public class FinalMethod {
	final void method() { //재정의 불가 메서드. 오버라이딩 불가 메서드 
		System.out.println("FinalMethod클래스의 method");
	}
}
class SubMethod extends FinalMethod {
//	void method() {
//		System.out.println("SubMethod클래스의 method");
//	}
}