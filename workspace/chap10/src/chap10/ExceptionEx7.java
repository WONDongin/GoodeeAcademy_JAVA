package chap10;

import java.io.IOException;

/*
오버라이딩에서의 예외처리 : 같거나 좁은 범위만 가능하다.
- 부모클래스의 메서드의 예외처리 보다 자손 클래스의 메서드의 예외처리는 같거나, 하위 예외 클래스로 선언해야 한다.

오버라이딩에서의 접근제어자 : 같거나 넓은 범위만 가능함

*/
class Parent{
	public void method() throws ClassNotFoundException{
		System.out.println("Parent 클래스의 method()");
	}
}

// RuntimeException : 예외처리 생략가능
class Child extends Parent{
	public void method() throws RuntimeException{
		System.out.println("Child 클래스의 method()");
	}
}
public class ExceptionEx7 {
	public static void main(String[] args) {
		Child c = new Child();
		c.method();
	}
}
