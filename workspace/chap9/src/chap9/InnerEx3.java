package chap9;
/*
내부 클래스에서 사용되는 this, super
*/
class ParentOuter{
	int iv = 0;
	int piv = 500;
}

class Outer3 extends ParentOuter{
	int iv = 10;
	int iv2 = 20;
	
	class InstanceInner{
		int iv = 100;
/*
내부클래스의 멤버메서드에서 변수 접근 우선순위
1. 지역변수
2. 내부클래스의 멤버 변수. this.멤버변수 접근 가능
3. 외부클래스의 멤버 변수. 외부클래스명.this.멤버변수 접근 가능		 
4. 외부클래스의 부모클래스의 멤버 변수. 외부클래스명.super.멤버변수 접근 가능		 
*/
		
		void method() {
			int iv = 300;
			System.out.println("iv=" + iv);
			// 내부에 값이 없으면 외부에서 가져옴
			System.out.println("iv2=" + iv2);
			System.out.println("piv=" + piv);
			
			// this 참조변수로는 외부클래스 멤버에 접근 불가, 나자신(InstanceInner), method x
			System.out.println("this.iv=" + this.iv); // 100
			
			// 외부클래스의 멤버 접근 : 외부클래스명.this.멤버명. 외부클래스의 멤버명이 한개인 경우
			System.out.println("this.iv=" + Outer3.this.iv);
			System.out.println("this.piv=" + Outer3.this.piv);
			
			// 외부클래스의 상위 멤버 iv 접근 : 외부클래스명.super.멤버명
			System.out.println("this.piv=" + Outer3.super.iv);
			System.out.println("this.piv=" + Outer3.super.piv);
		}
	}
}
public class InnerEx3 {
	public static void main(String[] args) {
		new Outer3().new InstanceInner().method();
	}
}
