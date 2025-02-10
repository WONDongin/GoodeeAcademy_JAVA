package ex6_this;

// 결과에 맞도록 Rectangle 클래스 구현하기
// 1. 생성자 구현시 생성자의 매개변수이름과, Rectangle 클래스의 멤버변수이름은 같은 이름으로 한다.
// 2. this() 생성자를 사용하여 생성자를 구현할 것
// class 멤버에서 사용x

public class Exam01 {
	public static void main(String[] args) {
		// 1번 생성자 호출
		Rectangle r1 = new Rectangle(10, 10); // 1번 사격형:(10, 10), 면적:100, 둘레:40, 정사각형
		// 2번 생성자 호출 -> this(1, 1) 1번 생성자 호출
		Rectangle r2 = new Rectangle();// 2번 사격형:(1, 1), 면적:1, 둘레:4, 정사각형
		// 3번 생성자 호출 -> this(whit, 1) 1번 생성자 호출
		Rectangle r3 = new Rectangle(10); // 3번 사격형:(10, 1), 면적:10, 둘레:12, 직사각형
		// 4번 생성자 호출 -> this(m.width, m.height) 1번 생성자 호출
		Rectangle r4 = new Rectangle(r1); // 4번 사격형:(10, 10), 면적:100, 둘레:40, 정사각형
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
	}
}
