package pkg01_abstract;

public class MainClass {
	public static void main(String[] args) {
		
		// Coffee 타입으로 형변환
		Coffee coffee1 = new Americano();
		Coffee coffee2 = new CafeLatte();
		
		coffee1.info(); // 물, 커피
		coffee2.info(); // 우유, 커피
		
		// 추상 클래스는 객체를 생성할수 없다.
		// Coffee coffee3 = new Coffee();
		
	}
}
