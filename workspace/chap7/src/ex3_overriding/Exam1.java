package ex3_overriding;
/*
 * Point3D 클래스 구현하기
 *  x,y,z 좌표를 멤버가 가짐
 */
class Point {
	int x,y;
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	void info() {
		System.out.println("위치 좌표: x=" + x +", y=" + y);
	}
}
class Point3D extends Point {
	int z;
	Point3D(int x, int y, int z) {
		super(x,y);
		this.z = z;
	}
	@Override
	void info() {
		System.out.println("위치 좌표: x=" + x +", y=" + y + ", z=" + z);
	}
}
public class Exam1 {
	public static void main(String[] args) {
		Point3D p3 = new Point3D(10,10,10);
		p3.info(); // 위치 좌표 : x=10, y=10, z=10
	}
}