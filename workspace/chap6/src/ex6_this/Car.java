package ex6_this;

public class Car {
	String color;
	int number;
	int serialNo;
	static int sno;
	
	// 우선순위 : 1. 지역변수(this) > 2 .멤버변수
	// c1
	Car(String color, int number){
		System.out.println("Car(String, int) 생성자");
		this.color = color;
		this.number = number;
		this.serialNo = ++sno;
	}
	// c2
	Car(){
		// 매개변수형이 String, int 다른 생성자 호출
		this("White", 1111);
		System.out.println("Car() 생성자");
		/* this.color = "White";
		this.number = 1111; // 멤버변수
		serialNo = ++sno; */
	}
	// c3
	Car(String color){
		this(color, 1111);
	}
	// c4
	Car(int number){
		this("White", number);
	}
	// c5
	Car(Car c) {
		this(c.color, c.number);
	}

	public String toString() {
		return serialNo + "번 자동차 : " + color + "," + number;
	}
}
