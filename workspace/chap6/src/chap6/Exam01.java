package chap6;
/*
 	결과가 출력되도록 Rectangle 클래스 구현하기
 	[결과]
 	사각형 면적 : 50
 	사각형 둘레 : 30
*/
class Rectangle{
	int width;
	int height;
	
	void area() {
		System.out.println("사각형의 면적: " +  width * height) ;
	}
	
	void length() {
		System.out.println("사각형의 둘레: " + (width  +  height)  * 2 ) ;
	}
}

public class Exam01 {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.width = 10;
		r1.height = 5;
		r1.area(); // 사각형의 면적 : 50
		r1.length(); // 사격형 둘레 : 30
	}
}