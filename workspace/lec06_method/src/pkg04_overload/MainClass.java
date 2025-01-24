package pkg04_overload;

public class MainClass {
	public static void main(String[] args) {
		// Calculator 객체 생성
		Calculator calculater = new Calculator();
		
		// add 메소드
		calculater.add(1, 2);
		calculater.add(1, 2, 3);
		calculater.add(1, 2, 3, 4);
		calculater.add(1.5, 1.6);
		calculater.add(1.5, 1.6, 1.7);
	}
}
