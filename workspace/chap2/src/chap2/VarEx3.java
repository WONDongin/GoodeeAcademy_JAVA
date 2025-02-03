package chap2;
/*
 	변수의 형변환 : 8개의 기본 자료형 중 boolean 를 제외한 7가지의 자료형은 형변환이 가능
 	기본자료형 : 변수
 	- 논리형 : boolean(1)
 	- 문자형 : char(2)
 	- 정수형 : byte(1), short(2), int(4), long(8)
 	- 실수형 : float(4), double(8)
 	
 	참조 자료형 : 객체, 인스턴스
 	- 배열 : array
 	- 클래스 : class
 	- 인터페이스 : interface
 	
 	기본 자료형의 형 변환
 	1. 기본자료형 중 boolean 를 제외한 7가지의 자료형은 형변환 가능
 	2. 기본 자료형과 참조자료형 사이는 형변환 x (Wrapper 클래스는 예외)
 	3. 자동형변환 : 형변환연산자 생략 가능 :  큰자료형 <- 작은자료형
 		명시적형변환 : 형변환 연산자 생략 불가능 : 작은 자료형 <- 큰자료형 
 */
public class VarEx3 {
	public static void main(String[] args) {
		byte b1 = 10;
		short s1 = 20;
		b1 = (byte) s1; // 명시적 형변환
		
		int i1 = 30;
		long l1 =40;
		float f1 = (float) i1; // (float) 형 변환 연산자 생략가능
		f1 = (float) 30.0; // 명시적 형변환, 실수형 리터널의 기본형은 double
		
		System.out.println("i1=" + i1);
		System.out.println("f1=" + f1); // 자동 형변환
		
		char cl = (char) b1; // byte, short 와 char 사이의 형변환에서는 형변환 연산자 생략 불가!
		System.out.println(cl);
	}
}
