package ex1_field;

public class Main3_StaticVal {
	public static void main(String[] args) {
			// 1. car1 생성. 색상 : White, 번호 :1234 인 객체 생성
			Car2 car1 = new Car2();
			car1.color = "White";
			car1.num = 1234;
			car1.sno = ++Car2.cnt;
			System.out.println(car1);
				
			// 2. car2 생성. 색상 : Black, 번호 :3456 인 객체 생성
			Car2 car2 = new Car2();
			car2.color = "Black";
			car2.num = 3456;
			car2.sno = ++Car2.cnt;
				
			System.out.println(car1);
			System.out.println(car2);
	}
}
