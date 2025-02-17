package ex7_random;

import java.util.Random;

/*
true/false 값을 난수로 발생하여 시스템과 사용자 중  3번 연속 true가 나오는 한쪽이 승리
하는 프로그램 구현

 시스템:true, 사용자: true;
*/

public class Exam1 {
	public static void main(String[] args) {
		Random sysrand = new Random();
		Random userrand = new Random();
		
		sysrand.setSeed(System.currentTimeMillis());
		userrand.setSeed(System.currentTimeMillis() + 100);
		
		int scnt = 0, ucnt = 0;
		
		while (true) {
			if(sysrand.nextBoolean()) {
				scnt++;
				System.out.print("시스템 true\t");
			} else {
				scnt = 0;
				System.out.print("시스템 false\t");
			}
			
			if(userrand.nextBoolean()) {
				ucnt++;
				System.out.println("사용자 true");
			} else {
				ucnt = 0;
				System.out.println("사용자 false");
			}
			
			if(ucnt == 3 || scnt == 3) {
				break;
			}
		}
		
		if(ucnt == scnt) {
			System.out.println("비김");
		} else if (ucnt > scnt) {
			System.out.println("사용자 승리");
		} else {
			System.out.println("시스템 승리");
		}
		
	}
}
