package ex6_wrapper;
/*
Wrapper 클래스 : 8개의 기본자료형을 객체화하기 위한 클래스
	기본자료형        Wrapper 클래스
	boolean         Boolean
	char               Character
	byte               Byte
	short              Short
	int                  Integer 
	long               Long
	float               Float
	double           Double
	
	기본자료형과 참조자료형은 형변환 불가
	String str = 'A' (X)
	예외적으로 기본자료형과 Wrapper 클래스간의 형변환 가능. (jdk5.0 이후부터 가능)
	참조형 <= 기본형 : auto Boxing
	기본형 <= 참조형 : auto UnBoxing
	
*/
public class WrapperEx1 {
	public static void main(String[] args) {
		Integer i1 = 100; // auto Boxing
		Integer i2 = 100; 
		System.out.println(i1 == i2);
		System.out.println(100 == i1);
		System.out.println(i1.equals(i2));
		// int 형 정보
		System.out.println("int 형의 최대값: " + Integer.MAX_VALUE);
		System.out.println("int 형의 최소값: " + Integer.MIN_VALUE);
		System.out.println("int 형의 bit 크기: " + Integer.SIZE); // 1byte = 8bit
		
		// double 형 정보
		System.out.println("double 형의 최대값: " + Double.MAX_VALUE); // 10DML 308승
		System.out.println("double 형의 최소값: " + Double.MIN_VALUE);
		System.out.println("double 형의 bit 크기: " + Double.SIZE); // 1byte = 8bit
		
		// int 형 <- 문자열
		// Int Integer.parseInt(숫자문자열) : 숫자문자열을 int 값으로 리턴
		System.out.println(Integer.parseInt("123")); // 123
		// Int Integer.parseInt(숫자문자열, 진법) : 숫자 문자열을 8진수로 인식하여 int 값으로 리턴
		System.out.println(Integer.parseInt("123", 8)); //83   8진수 → 10진수
		System.out.println(Integer.parseInt("123", 16)); // 291   16진수 → 10진수
		
		// double 형 <= 문자형
		System.out.println(Double.parseDouble("123.5"));
		// float 형 <= 문자형
		System.out.println(Float.parseFloat("123.5"));
		// 255를 2진수
		System.out.println(Integer.toBinaryString(255));
		// 255를 8진수
		System.out.println(Integer.toOctalString(255));
		// 255를 16진수
		System.out.println(Integer.toHexString(255));
	}
}
