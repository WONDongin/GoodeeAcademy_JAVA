package chap8;

/*
LambdaInterface2 인터페이스를 이용하여 입력된 값까지 합을 구하기
*/
public class Exam2 {
	public static void main(String[] args) {
		
		LambdaInterface2 f = null;
		
		// 1 ~ n까지의 합
		f = (n) -> {
			int sum = 0;
			for(int i = 1; i <= n; i++) {
				sum += i;
			}
			System.out.println("1~" + n + "까지의 합:" + sum);
		}; 
		
		calc(f, 10); //55
		calc(f, 100); //5050
		
		// n!값을 출력하기.
		f = n -> {
			int factorial = 1;
			for(int i = n; i > 0; i--) factorial *= i;			
			System.out.println("값:" + factorial);
		};
		
		calc(f, 4); // 24
		calc(f, 5); // 120
	}

	
	private static void calc(LambdaInterface2 f, int num) {
		f.method(num);
	}
}
