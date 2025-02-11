package ex3_overriding;
/*
 * 오버라이딩 예제
 *   - 상속관계에서 나타남
 *   - 부모클래스의 메서드를 자손클래스에서 재정의함. 메서드의 재정의
 *   - 부모클래스의 메서드의 선언부와 자손클래스의 메서드의 선언부가 같아야 함.
 *     단 접근제어자는 넓은 범위로 가능. 예외처리는 좁은 범위로 가능
 */
public class OverridingEx01 {
	public static void main(String[] args) {
		AutoBike ab = new AutoBike(2);
		ab.power();
		System.out.println(ab.drive());
		System.out.println(ab.stop());
		Bike b = new Bike(2);
		System.out.println(b.drive());
		System.out.println(b.stop());
	}
}