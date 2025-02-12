package ex8_modifier;

import ex8_modifier.test.Modifier2;

/*
제한자 : 접근제한자, 그 외 제한자 (static, abstract, final) 

접근제한자 
private < (defalut) < protected < public

- private : 동일한 클래스 내에서만 접근 허용
- (defalut) : 동일한 패키지에 속한 클래스에서 접근허용
- protected : 다른 패키지의 경우 상속관계 경우 접근 허용
- public : 접근 허용

*/
class Modifier1{
	private int v1 = 100;
				int v2 = 200; // defalut
	protected int v3 = 300;
	public int v4 = 400;
	public void method() {
		System.out.println("ex8_modifer.Modifier1 클래스의 method()");
		System.out.println("v1=" + v1);
		System.out.println("v2=" + v2);
		System.out.println("v3=" + v3);
		System.out.println("v4=" + v4);
	}
}

class Modifier3 extends Modifier2{
	void method2() {
		System.out.println("ex8_modifier.test.Modifier3 클래스의 method");
		//System.out.println("v1=" + v1); // private 이므로 접근불가
		//System.out.println("v2=" + v2); // default 이므로 접근불가
		System.out.println("v3" + v3); // 상속관계이므로 접근허용
		System.out.println("v4=" + v4);
	}
	
	public void method(){
		System.out.println("v3" + v3); // 상속관계
		System.out.println("v4" + v4); 
	}
}
public class ModifierEx1 {
	public static void main(String[] args) {
		Modifier1 m1 = new Modifier1();
		m1.method();
		System.out.println("ModifierEx1 클래스의  main 메서드에서 호출");
		// System.out.println("m1.v1=" + m1.v1); // v1 접근제한자가 private 이므로 접근불가
		System.out.println("m1.v2=" + m1.v2);
		System.out.println("m1.v3=" + m1.v3);
		System.out.println("m1.v4=" + m1.v4);
		
		Modifier2 m2 = new Modifier2();	
		m2.methid();
		// System.out.println("m2.v2=" + m2.v2); // v1 접근제한자 private 이므로 접근불가
		// System.out.println("m2.v2=" + m2.v2); // v2 접근제한자 default 이므로 접근불가
		// System.out.println("m2.v3=" + m2.v3); // v3 접근제한자 protected 이므로 접근불가
		System.out.println("m2.v4=" + m2.v4);
	}
}
