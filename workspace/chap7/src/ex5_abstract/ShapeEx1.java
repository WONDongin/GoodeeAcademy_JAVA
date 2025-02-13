package ex5_abstract;

public class ShapeEx1 {
	public static void main(String[] args) {
		//추상클래스는 객체화 불가
//		Shape s = new Shape("도형");
		Shape[] arr = new Shape[2];
		arr[0] = new Circle(10);
		arr[1] = new Rectangle(10,10);
		// 도형의 면적의 합과 둘레합 출력하기
		double totArea=0,totLength=0;
		for(Shape s : arr) {
			System.out.println(s);
			totArea += s.area();
			totLength += s.length();
		}
		System.out.println("전체 면적:" + totArea);
		System.out.println("전체 둘레:" + totLength);
	}
}