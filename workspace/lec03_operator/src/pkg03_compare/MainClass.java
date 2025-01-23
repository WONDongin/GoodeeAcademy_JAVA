package pkg03_compare;

public class MainClass {
	public static void main(String[] args) {
		// 크기 비교
		// 결과는 boolean 타입(true, false)
		
		int a = 10;
		int b = 5;
		
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a == b);
		System.out.println(a != b);
		
		/*
		  	논리 연산
		 	- 1. 논리 AND : 모두 true 이면 결과 > true (&&)
		 	- 2. 논리 OR : 하나라도 true 이면 결과 > true (||)
		 	- 3. 논리 NOT : true와 false 결과를 반전 (!())
		 */
		
		int x = 10;
		int y = 15;
		System.out.println(x == 10 && y == 15);
		System.out.println(x == 10 || y == 10);
		System.out.println(!(x == 10));
	}
}
