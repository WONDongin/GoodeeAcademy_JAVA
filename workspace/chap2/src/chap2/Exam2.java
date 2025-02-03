package chap2;
/*
 *	
 */
public class Exam2 {
	public static void main(String[] args) {
		float f = (float) 3 / 2; // int 연산자(/ 나누기) -> 결과 int
		long l =(long) 3000 * 3000 * 3000;
		float f2 = 0.1f;
		double d = (float) 0.1;
		boolean result = d == f2;
		
		System.out.println("f=" + f );
		System.out.println("l=" + l );
		System.out.printf("%.20f\n", f2);
		System.out.printf("%.20f\n", d);
		System.out.println("result=" + result );
	}
}
