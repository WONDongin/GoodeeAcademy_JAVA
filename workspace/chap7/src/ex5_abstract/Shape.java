package ex5_abstract;
/*
 * 추상클래스
 * 1. 추상메서드를 멤버로 가질 수 있는 클래스 . abstract 예약어를 사용함
 * 2. 객체화 불가 => 상속을 통해서 자손클래스의 객체화로 객체화 가능 
 * 3. 그외는 일반 클래스와 동일함 
 *    - 생성자.
 *    - 멤버변수, 멤버메서드
 *    - 초기화블럭
 *    - 다른 클래스의 자손클래스
 *    
 * 추상메서드
 * 1. 메서드의 선언부만 존재. 구현부{}가 없다. abstract 예약어 사용함
 * 2. 자손클래스에서 반드시 오버라이딩 필요   
 */
public abstract class Shape {  //도형클래스 => 추상클래스
   String type;
   Shape(String type) {
	   this.type = type;
   }
   abstract double area();  //추상메서드. 하위 클래스에서 오버라이딩 필수
   abstract double length(); //추상메서드
}
class Circle extends Shape {
	int r;
	Circle(int r) {
		super("원");
		this.r = r;
	}
	@Override
	double area() {
		return r*r*Math.PI;
	}
	@Override
	double length() {
		return 2*r*Math.PI;
	}
	@Override
	public String toString() {
		return type + ":"+ r + "=> 면적:" + area() + ",둘레:"+length();
	}
}
/*
 *  Rectangle(사각형)클래스 구현
 *  멤버변수 : width, height
 */
class Rectangle extends Shape {
	int width,height;
	Rectangle(int width, int height) {
		super("사각형");
		this.width = width;
		this.height = height;
	}
	@Override
	double area() {
		return width * height;
	}
	@Override
	double length() {
		return (width + height) * 2;
	}
	@Override
	public String toString() {
		return type + ":"+ width + ","+height + "=> 면적:" + area() + ",둘레:"+length();
	}
	
}