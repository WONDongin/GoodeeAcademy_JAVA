package ex1_field;

// 출력결과가 나오도록 Rectangle 클래스 구현하기

public class Exam01 {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.width = 10;
		r1.height = 20;
		r1.sno = ++Rectangle.cnt; // static : 생성자 없이 바로 가져와 사용
		System.out.println(r1); // 1번 사각형: 가로(10),  세로(20), 현재까지 생성된 사각형(1)
		
		Rectangle r2 = new Rectangle();
		r2.width = 1;
		r2.height = 2;
		r2.sno = ++Rectangle.cnt;
		System.out.println(r2);  // 2번 사각형: 가로(1),  세로(2), 현재까지 생성된 사각형(2)
	}
}
