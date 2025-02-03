package chap2;
/*
 	정수 변수 선언하여 화면에 출력하기
 	
 */
public class VarEx1 {
	public static void main(String[] args) {
		byte b1 = 10; // byte b1 : 변수의 선언. b1 =10 : 변수 초기화
		short s1 = 20;
		int i1 = 30;
		long l1 = 40;
		
		System.out.println("b1= " + b1);  // 콘솔(화면)출력. 표준출력
		System.out.println("s1= " + s1); 
		System.out.println("i1= " + i1);  
		System.out.println("l1= " + l1); 
		
		// b1 = 128; 오류발생 byte 형으로 저장할 수 있는 값이 아님 (-127~127)
		// 0 : 양수 , 1: 음수
		b1 = (byte)256; // 형변환 연산자(캐스팅)
		System.out.println("b1=" + b1);
		
		
	}
}
