package pkg01_arithmetic;

public class MainClass {

	public static void main(String[] args) {
		// 1. 산술 연산자
		int a = 5;
		int b = 2;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println((double) a / b); // 몫
		System.out.println(a % b); // 나머지
		
		// 2. 대입 연산자
		long c = 10;
		long d = c;
		System.out.println(d);
		
		// 3. 복합 연산자
		int x = 10;
		int y = 5;
		x += y; // x = x+y
		System.out.print(x);

	}

}
