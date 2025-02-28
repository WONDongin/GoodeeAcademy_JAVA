package ex1_create;
/*
Thread 생성
1. Thread 클래스를 상속
2. run() 메서드 구현: 스레드의 기능
3. 
4.


Thread 생성
start()
실행가능상태 (runnable 상태)
스케줄러
Running 상태 (run 메서드 실행중) -- 대기상태(sleep())-> runnable 상태로 돌아가기 
Dest 상태 (run 메스드 종료)
*/
class Thread1 extends Thread{
	public Thread1(String name) {
		super(name); //Thread의 이름 설정
	}
	// Thread 수행 해야할 메서드.
	public void run() { // Running 상태 (run 메서드 실행중)
		for(int i = 1; i <= 5; i++) {
			// getName() : Thread의 이름출력
			System.out.println(i + "=" + getName());
			try {
				sleep(1000); //1000밀리초 = 1초, 대기상태
			} catch (InterruptedException e) {}
		}
	}
}
public class ThreadEx1 {
	public static void main(String[] args) {
		System.out.println("main Thread 시작");
		// Thread 객체 생성
		Thread t1 = new Thread1("First");
		Thread t2 = new Thread1("Second");
		t1.start(); // t1 객체의 Runnable 상태
		t2.start(); // t2 객체의 Runnable 상태
		/*
	  	start() : Thread의 시작. 병렬화 시킴. 멀티스레드 환경
	  	1. 스택영역을 병렬화 시킴
	  	2. 병렬화된 스택영역에 run() 메서드 호출
		*/
		System.out.println("main Thread 종료");
	}
}
