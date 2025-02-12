package test;
/*
 * 구동클래스를 실행하였을때 다음의 결과가 나오도록
 * 관련 클래스를 구현하기
 [결과]  
DanceRobot은 춤을 춤니다.
SingRobot은 노래를 부릅니다.
DrawRobot은 그림을 그립니다.
 */

interface Robot {
	void action();
}

class DanceRobot implements Robot{
	
	@Override
	public void action() {
		System.out.println("DanceRobot은 춤을 춤니다.");
	}
}

class SingRobot implements Robot{
	
	@Override
	public void action() {
		System.out.println("SingRobot은 노래를 부릅니다.");
	}
}

class DrawRobot implements Robot{
	
	@Override
	public void action() {
		System.out.println("DrawRobot은 그림을 그립니다.");
	}
}


public class Test03 {
	public static void main(String[] args) {
		Robot[] robot = new Robot[3];
		robot[0] = new DanceRobot();
		robot[1] = new SingRobot();
		robot[2] = new DrawRobot();
		for(Robot r : robot) {
			r.action(); 
		}
	}
}
