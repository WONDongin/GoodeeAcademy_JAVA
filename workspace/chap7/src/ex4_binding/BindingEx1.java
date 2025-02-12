package ex4_binding;
/*
 * 1. 자손타입의 객체를 부모타입의 참조변수로 참조가 가능 : 다형성
 * 2. 부모타입의 참조변수로 자손타입의 객체를 참조하는 경우
 *    같은 멤버인 경우
 *    변수 : 참조변수의 자료형을 기준으로 호출됨
 *    멤서드 : 객체의 최종 오버라이딩된 메서드가 호출됨
 * 3. 모든클래스의 객체는 Object 참조변수로 형변환이 가능함.
 * 4. 모든클래스의 객체는 Object 참조변수로 참조가 가능함.      
 */
class Parent {
	int x = 10;
	void method() {
		System.out.println("Parent 클래스의 method");
	}
}
class Child extends Parent{
	int x = 20;
	void method() {
		System.out.println("Child 클래스의 method");
		System.out.println("x=" +x);
		System.out.println("this.x=" +this.x);
		System.out.println("super.x=" +super.x);
	}
}
public class BindingEx1 {
	public static void main(String[] args) {
		Parent p = new Child();
		System.out.println(p.x);
		p.method();
		Child c = (Child)p; // 자손타입의 자료형 <- 부모타입의 자료형 : 형변환 연산자 생략 불가. 명시적형변환
		System.out.println(c.x);
		c.method();
		Object o = (Object)p; // 부모타입의 자료형 <- 자손타입의 자료형 : 형변환 연산자 생략 가능. 자동형변환
		
		// 10 부모 20 자식  20 20 10 
	}
}