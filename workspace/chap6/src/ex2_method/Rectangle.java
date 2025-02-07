package ex2_method;

public class Rectangle {
	int width, height, serialNo;
	static int cnt;
	
	 int  area() {
		return width * height;
	}
	 
	int length() {
		return (width + height) * 2;
	}
	
	boolean  isSquare() {
		return width == height;
	}
	
	public String toString() {
		return serialNo + "번 사각형(" + width + ", " + height + ") 생성된 사각형 갯수: " + cnt  + "=> 면적: " + area() + ",  둘레: " + length() + ", " + ((isSquare())? "정사각형" : "직사각형")  ;
	}
}
