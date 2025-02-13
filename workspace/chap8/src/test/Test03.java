package test;
/*
 * 구동클래스를 실행하였을때 다음의 결과가 나오도록
 * 관련 클래스를 구현하기
 [결과]  
DanceRobot은 춤을 춤니다.
SingRobot은 노래를 부릅니다.
DrawRobot은 그림을 그립니다.

인터페이스 : 상속받는 클래스 void(public) : 무조건 public (1개)
추상클래스 : 상속받는 클래스 void(defalt) : public, portected (2개 선택가능)

DB 처리시 : CRUD 
Create(insert : 데이터 추가)
Read(select : 데이터 조회)
Update(update : 데이터 수정)
Delete(delete : 데이터 삭제)
 */

abstract class Robot2 {
	String name;
	Robot2(String name){
		this.name = name;
	}
	abstract void action();
}

class DanceRobot extends Robot2{
	
	DanceRobot() {
		super("DanceRobot");
	}
	
	@Override
	protected void action() {
		System.out.println(name + "은 춤을 춤니다.");
	}
}

class SingRobot extends Robot2{
	
	SingRobot() {
		super("SingRobot");
	}
	
	@Override
	public void action() {
		System.out.println(name + "은 노래를 부릅니다.");
	}
}

class DrawRobot extends Robot2{
	
	DrawRobot() {
		super("DrawRobot");
	}
	
	@Override
	public void action() {
		System.out.println(name + "은 그림을 그립니다.");
	}
}


public class Test03 {
	public static void main(String[] args) {
		Robot2[] robot = new Robot2[3];
		robot[0] = new DanceRobot();
		robot[1] = new SingRobot();
		robot[2] = new DrawRobot();
		for(Robot2 r : robot) {
			r.action(); 
		}
	}
}
