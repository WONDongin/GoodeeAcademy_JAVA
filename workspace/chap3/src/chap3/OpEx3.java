package chap3;
/*
 	이항 연산자
 		산술연산자 : +, -, *, /, %(나머지)
 		
 */
public class OpEx3 {
	public static void main(String[] args) {
		int x = 10, y = 8;
		System.out.println("10+8= " + (x + y));
		System.out.println("10-8= " + (x - y));
		System.out.println("10*8= " + (x * y));
		System.out.println("10/8= " + (x / y)); // int형의 연산의 결과 int
		System.out.println("10%8= " + (x % y)); // 나머지 2
		
		// 나누기
		System.out.println("10/8= " + (x / y)); // 1
		System.out.println("-10/8= " + (-x / y)); // -1
		System.out.println("10/-8= " + (x / -y)); // -1
		System.out.println("-10/-8= " + (-x / -y)); // 1
		
		// 나머지 (피젯수 부호(앞의 숫자)를 따라간다.)
		System.out.println("10%8= " + (x % y)); // 2
		System.out.println("-10%8= " + (-x % y)); // -2
		System.out.println("10%-8= " + (x % -y)); // 2
		System.out.println("-10%-8= " + (-x % -y)); // -2
	}
}
