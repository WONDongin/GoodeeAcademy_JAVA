package pkg06_object;

public class MainClass {
	public static void main(String[] args) {
		
		// 1. Object 타입으로 업캐스팅
		Object car1 = new Car("자동차");
		
		// Object 타입으로 저장된 객체는 다운캐스팅해서 사용
		if(car1 instanceof Car ) {
			System.out.println(((Car) car1).getModel());
		}
		
		// 2. Object 클래스의 toString() 메소드
		System.out.println(car1);
		System.out.println(car1.toString());
		
		// 3. Object 클래스의 equals() 메소드
		Car car2 = new Car("자동차");
		Car car3 = new Car("자동차");
		
		// 물리적 관점 : 다른 자동차 (Object 클래스의 equals() 메소드)
		// 논리적 관점 : 같은 자동차(String model을 비교하는 equals() 메소드로 오버라이드)
		
		System.out.println(car2.equals(car3));
		
		
		
	}
}
