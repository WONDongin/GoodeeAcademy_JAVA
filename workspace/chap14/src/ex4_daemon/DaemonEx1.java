package ex4_daemon;
/*
데몬 스레드
1. 일반 스레드의 보조기능을 담당
2. 일반 스레드가 종료되면 데몬 스레드도 자동 종료
3. 가비지콜렉터가 대표적인 데몬 스레드임.
4. 무한반복 형태로 구현함
 
*/
class DaemonThread extends Thread{
	public void run() {
		while (true) {
			/*
			Thread[#21,Thread-0,5,main]
			Thread[번호, 스레드이름, 우선순위, 스레드그룹] 
			- 스레드의 이름이 지정되지 않으면 Thread-0번부터 자동으로 이름 부여
			*/
			System.out.println(this);
			try {
				sleep(100);
			} catch (InterruptedException e) {}
		}
	}
}
public class DaemonEx1 {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main 스레드 시작");
		DaemonThread t1 = new DaemonThread();
		DaemonThread t2 = new DaemonThread();
		
		t1.setDaemon(true); t2.setDaemon(true); // 데몬스레드로 설정
		t1.start(); t2.start();
		
		Thread.sleep(2000); // 2초 대기
		System.out.println("main 스레드 종료");
	}// main 메서드 종료시 t1, t2 데몬스레드도 함께 종료
}
