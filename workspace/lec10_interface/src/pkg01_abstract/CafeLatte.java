package pkg01_abstract;

//추상 클래스를 상속 받은 클래스 -> 반드시 추상 메소드 오버라이딩!

public class CafeLatte extends Coffee{

	@Override
	public void info() {
		System.out.println("우유, 커피");
	}
	
	
}
