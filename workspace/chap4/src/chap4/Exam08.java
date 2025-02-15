package chap4;
/*
 	1 ~ 100까지 숫자 중 2의 배수도 아니고, 3의 배수도 아닌 수의 합을 출력하기
 */
public class Exam08 {
	public static void main(String[] args) {
		
		// 방법 1
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(!(i % 2 == 0) && !(i % 3 == 0)) {
				sum += i;
			}
		}
		
		System.out.println("합계: " + sum);
		
		
		
		// 방법 2
		sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			if((i % 2 == 0) ) {continue;}
			if((i % 3 == 0) ) {continue;}
			sum += i;
		}
		
		System.out.println("합계: " + sum);
		
	}
}
