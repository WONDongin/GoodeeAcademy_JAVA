package ex5_constructor;

public class Car {
	String color;
	int number;
	static int width = 200;
	static int height = 120;
	
	// c1
	Car(String c, int n ) {
		color = c;
		number = n;
	}
	// c2
	Car(String c) {
		color = c;
		number = 1234;
	}
	// c3
	Car(int n ) {
		color = "White";
		number = n;
	}
	
	public String toString() {
		return color + "," + number + "(" + width + "," + height + ")";
	}
	
}
