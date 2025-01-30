package pkg04_math;

public class MainClass {
	public static void main(String[] args) {
		
		// Math 클래스
		System.out.println("절대값: " + Math.abs(-10));
		System.out.println("정수올림값: " + Math.ceil(1.1));
		System.out.println("정수내림값: " + Math.floor(1.9));
		System.out.println("제곱: " + Math.pow(2, 2.5));
		System.out.println("제곱근: " + Math.sqrt(25));
		
		double a = Math.random(); // 0.0 <= a < 1.0
		System.out.println((int)(a * 6 + 1)); // 1 ~ 7 미만
		
	}
}
