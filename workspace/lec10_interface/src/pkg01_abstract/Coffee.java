package pkg01_abstract;

// 추상 메소드를 가지고 있는 클래스 -> 추상 클래스
// abstract 추가

public abstract class Coffee {
	
	// Coffee 를 상속 받는 클래스들이 info()  메소드 사용가능
	// 본문이 불 필요한 메소드 -> 추상 메소드로 만들수 있다.
	public abstract void info();
}
