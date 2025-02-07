package ex2_method;

public class Exam01 {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.width = 30;
		r1.height = 20;
		r1.serialNo = ++Rectangle.cnt;
		System.out.println(r1); 
		// 1번 사각형(30, 20) 생성된 사각형 갯수: 1 => 면적: 600, 둘레: 100, 직사각형
	}
}	
