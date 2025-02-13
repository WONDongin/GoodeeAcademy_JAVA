package chap9;
/*
람다 객체에서의 this
 
*/
@FunctionalInterface
interface LambdaInterface{
	void method();
}

class Outer{
	public int iv = 10;
	
	void method() {
		int iv = 40;
		// iv++;
		
		LambdaInterface f = () -> {
			System.out.println("iv=" + iv); // 외부메서드의 지역변수는 상수화 필요
			System.out.println("this.iv" + this.iv); // Outer 클래스의 멤버변수(외부클래스) 호출가능
			System.out.println("Outer.this.iv" + Outer.this.iv); // Outer 클래스의 멤버 변수 호출가능
		};
		f.method();
	}
}
public class InnerEx4 {
	public static void main(String[] args) {
	
		new Outer().method();
	}
}
