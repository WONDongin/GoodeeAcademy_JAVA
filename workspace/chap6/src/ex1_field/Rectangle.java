package ex1_field;

public class Rectangle {
	
	int width;
	int height;
	int sno;
	static int cnt;
	
	// 1번 사각형: 가로(10),  세로(20), 현재까지 생성된 사각형(1)
	public String toString() {
		return  sno +"번 사각형: 가로: " + width + ", 세로: " + height + ", 현재까지 생산 갯수: " + cnt;
	}
}
