package ex5_other;
/*
Thread 우선순위
Runnable 상태에서 Running 상태 변경시 스케줄러가 관여함. 개발자의 영역이 아님
우선수위 설정하여 실행상태의 확률을 높일 수 있음

우선순위 : 1 ~ 10까지
10: 가장 높은 우선순위
5 :     기본 우선순위
1 : 가장 낮은 우선수위
*/
class ThreadPriority extends Thread{
	ThreadPriority(String name) {
		this(name, Thread.NORM_PRIORITY); // 
	}
	ThreadPriority(String name, int p) {
		super(name); // 스레드 이름
		this.setPriority(p); // 우선순위 설정
	}
	
	@Override
	public void run() {
		try {
			sleep(200);
		} catch (InterruptedException e) {}
		for(int i = 0; i < 5; i++) {
			System.out.println(this.toString());
		}
	}
}
public class PriorityEx1 {
	public static void main(String[] args) {
		System.out.println("높은 우선순위: " + Thread.MAX_PRIORITY);
		System.out.println("기본 우선순위: " + Thread.NORM_PRIORITY);
		System.out.println("낮은 우선순위: " + Thread.MIN_PRIORITY);
		
		Thread t1 = new ThreadPriority("First", 1);
		Thread t2 = new ThreadPriority("Second");
		Thread t3 = new ThreadPriority("Third", 10);
		t1.start(); t2.start(); t3.start();
		System.out.println("main 종료");
	}
}
