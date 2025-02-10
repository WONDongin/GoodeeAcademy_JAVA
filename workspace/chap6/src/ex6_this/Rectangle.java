package ex6_this;

public class Rectangle {
	int width, height, no;
	static int cnt;
	
	// r1
	Rectangle(int w, int h) {
		this.width = w;
		this.height = h;
		no = ++cnt;
	}
	// r2
	Rectangle(){
		this(1, 1); // 생성의 첫줄에서 호출되어야 한다.
	}
	// r3
	Rectangle(int w){
		this(w, 1);
	}
	// r4
	Rectangle(Rectangle m){
		this(m.width, m.height);
	}
	// 둘레
	int area() {
		return (width * height);
	}
	// 면적
	int lenght() {
		return (width + height) * 2;
		// this.width + this.height
	}
	// 정/직사각형 구분
	String result() {
		return width == height ? "정사각형" : "직사각형";
	}
	
	public String toString() {
		return no +"번 사각형:(" + width +"," + height + "), 면적:" + area() + ", 둘레:" + lenght() + "," + result();
	}
}
