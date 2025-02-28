package ex2_synchronized;

/*
동기화 메서드 방식

동기화 영역. 임계영역. synchrinized 예약어 사용
- 동기화 블럭
	블록에 synchrinized(lock 객체) 예약어 사용
	lock 객체는 공유객체여야한다. 모든 스레드가 하나의 lock 객체를 공유해야한다.
	
- 동기화 메서드 : thread safe 메서드
	메서드 synchronized 예약어 사용. 메서드를 lock으로 사용함
	동기화 메서드도 유일해야 한다. 공유객체의 메서드여야한다.

*/
class PrintThread3 extends Thread{
	Printer prt;
	char ch;
	
	PrintThread3(Printer prt, char ch){
		this.prt = prt;
		this.ch = ch;
	}
	
	public void run(){
		for(int i = 1; i <= 20; i++) {
			prt.printChar(ch);
		}
	}
}

class Printer{
	// 동기화 메서드 방식
	public synchronized void printChar(char ch) { 
		for (int i = 0; i < 80; i++ ) {
			System.out.print(ch);
		}
		System.out.println();
	}
}

public class PrintThreadEx3 {
	public static void main(String[] args) {
		Printer ptr = new Printer();
		PrintThread3 t1 = new PrintThread3(ptr,'A');
		PrintThread3 t2 = new PrintThread3(ptr,'B');
		PrintThread3 t3 = new PrintThread3(ptr,'C');
		
		t1.start();t2.start();t3.start();
	}
}
