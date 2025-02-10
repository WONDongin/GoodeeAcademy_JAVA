package ex5_constructor;

public class Rectangle {
	int width, height;
	// r1
	Rectangle(int w, int h){
		this.width = w;
		this.height = h;
	}
	// r2
	Rectangle(int w){
		this.width = w;
		this.height = 1;
	}
	
	// 둘레
	int  area() {
		return width * height;
	}
	// 면적
	int length() {
		return (width + height) * 2;
	}
	
	public String toString() {
		return "(" + width + ", " +  height + "), 면적:" + area() + ", 둘레:" + length();
	}
}
