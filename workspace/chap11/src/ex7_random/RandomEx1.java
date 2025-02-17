package ex7_random;

import java.util.Random;

/*
Random 클래스 : 난수 발생 클래스
1. seed 값 설정 가능
2. 자료형별로 난수 발생
 - nextInt() : 정수형 난수
 - nextInt(n) : 정수형 난수. 0 <= x < n
 - nextDouble() : 실수형 난수. 0 <= x < 1.0
 - nextBooleant() : true/false
*/
class RandomEx1 {
	public static void main(String[] args) {
		Random rand1 = new Random();
		rand1.setSeed(1);
		for(int i = 0; i < 5; i++) {
			System.out.println(i + ":" + rand1.nextInt(100) ); // 0 ~ 99사이의 임의 값
		}
		Random rand2 = new Random();
		System.out.println("=========");
		/*
		 System.crrentTImeMillis() : 1970년 부터 현재까지의 시간을 밀리초로
		*/
	
		rand2.setSeed(System.currentTimeMillis());
		for(int i = 0; i < 5; i++) {
			System.out.println(i + ":" + rand2.nextInt(100) );
			
		}
		// true/false 난수생성
		for(int i = 0; i  <5; i++) {
			System.out.println(i + ":" + rand2.nextInt(100) );
		}
	}
}
