package ex5_math;
/*
round(실수값, 자리수) : 실수값을 반올림하여 소숫점이하 자리수로 출력하기
- 실수값을 소수점 이하 자리수 까지 출력하기 
*/
public class Exam1 {
	public static void main(String[] args) {
		System.out.println(round(3.1215,1)); // 3.1
		System.out.println(round(3.1215,2)); // 3.2
		System.out.println(round(3.1215,3)); // 3.122
		System.out.println(truncate(3.15345,1)); // 3.1
		System.out.println(truncate(3.15345,2)); // 3.15
		System.out.println(truncate(3.15345,3)); // 3.13
		System.out.println();
		System.out.println(round2(3.1215,1)); // 3.1
		System.out.println(round2(3.1215,2)); // 3.2
		System.out.println(round2(3.1215,3)); // 3.122
	}
	private static double truncate(double d, int i) {
		double num = Math.pow(10, i); // 10의 제곱
		return (int) (d * num)/num;
	}
	// String
	private static String round(double d, int i) {
		// %.1f : 소수점이하 한자리.
		return String.format("%." + i + "f", d);
	}
	// Double
	private static double round2(double d, int i) {
		// %.1f : 소수점이하 한자리.
		return Double.parseDouble(String.format("%." + i + "f", d));
	}
}