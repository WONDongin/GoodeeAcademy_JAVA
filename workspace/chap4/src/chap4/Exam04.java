package chap4;
/*
 	1~100까지 짝수의 합을 구하기.
 	for
 	while
 	do while
 */
public class Exam04 {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				sum += i;
			}
		}
		
		System.out.println("총합: " + sum);
		
	
		int num = 1;
		int su2 = 0;
		
		while (num <= 100) {
	
			if(num % 2 == 0) {
				su2 += num;
			}
			num++;
		}
		
		System.out.println("총합: " + su2);
		
		int nu3 = 2;
		int result3 = 0;
		
		do {
			result3 += nu3;
			nu3 += 2;
		} while(nu3 <= 100);
		
		System.out.println("총합: " + result3);
		
	
		
	
		

	}
}
