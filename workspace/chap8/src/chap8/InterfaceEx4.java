package chap8;
/*
추상클래스와 인터페이스를 이름 없는 내부 객체로 생성하기
*/
interface Action{	
	void action();
}

abstract class Abs{
	int num = 100;
	abstract void mothod();
}

public class InterfaceEx4 {
	public static void main(String[] args) {
		// 내부겍체
		Action a = new Action() {
			
			@Override
			public void action() {
				System.out.println("Action 인터페이스의 action 메서드");
			}
		};
		a.action();
		
		
		// Abs 클래스의 객체 생성
		Abs abs = new Abs() {
			
			@Override
			void mothod() {
				// Abs 객체의 num 값 출력
				System.out.println("Abs 클래스의 num = " + num);
			}
		};
		abs.mothod();
		
		// 람다식 : 함수 객체
		a = ()->System.out.print("람다방식으로 Action 인터페이스 구현");
		a.action();
		
	}
}
