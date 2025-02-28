package ex5_other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
join 메서드 : 스레드가 종료할때 까지 join() 메서드를 호출한 메서드가 대기함

1~1000까지의 합 구하기
t1 ~ t5 다섯개의 스레드가 200씩 나누어서 합을 구하고 main은 대기 후 전체 합 출력하기
*/
class SumRunnable implements Runnable{
	int firstNum, lastNum;
	int sum;
	public SumRunnable(int firstNum, int lastNum) {
		this.firstNum = firstNum;
		this.lastNum = lastNum;
	}
	
	public void run() {
		for(int i = firstNum; i <= lastNum; i++) sum += i;
	}
	
}
public class JoinEx1 {
	public static void main(String[] args) throws InterruptedException {
		// List Arrays.asList(값들)
		List<SumRunnable> list = Arrays.asList(
				new SumRunnable(1, 200),   new SumRunnable(201, 400), 
				new SumRunnable(401, 600), new SumRunnable(601, 800));
		
		List<Thread> list1 = new ArrayList<>(); // Thread 객체 5개 저장
		for(Runnable s : list) list1.add(new Thread(s));
		for(Thread t : list1) t.start(); // 5개의 스레드가 start()
		/*
		모든 스레드가 종료할때 까지 main 메서드가 대기함 
		*/
		for(Thread t : list1) t.join();
		// 모든 스레드의 상태가 dead 상태인 경우 실행
		// 모든 스레드의 합의 합을 출력
		int sum = 0;
		for(SumRunnable s : list) sum += s.sum;
		System.out.println("전체 합계: " + sum); // 1~ 1000까지의 전체 합
	}
}
