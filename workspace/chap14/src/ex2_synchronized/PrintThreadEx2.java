package ex2_synchronized;

/*
동기화 블럭 예제
1. synchronized 예약어 사용.
2. lock 객체는 유일해야함
3. lock 기본자료형은 안됨
*/
class PrintThread2 extends Thread{
	char ch;
	static Object lock = new Object();
	// static String lock = new String();
	// static int lock = new int(); // 객체여야 한다.
	
	PrintThread2(char ch){
		this.ch = ch;
	}
	
	public void run(){
		for(int i = 1; i <= 20; i++) {
			// 동기화 블럭방식
			synchronized (lock) {
				for(int j = 0; j < 80; j++) {
					System.out.print(ch);
				}
				System.out.println();
				/*
				 * try { sleep(5); } catch (InterruptedException e) {}
				 */
			}
		}
	}
}

public class PrintThreadEx2 {
	public static void main(String[] args) {
		PrintThread2 t1 = new PrintThread2('A');
		PrintThread2 t2 = new PrintThread2('B');
		PrintThread2 t3 = new PrintThread2('C');
		
		t1.start();t2.start();t3.start();
	}
}
