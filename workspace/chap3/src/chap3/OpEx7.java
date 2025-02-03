package chap3;
/*
 	String 클래스에서 + 연산 사용하기
 	
 	1. + 연산자 사용가능
 		String = String + 기본 자료형
 		
 	2. 대입연산자로 객체 생성 가능
 		객체 생성
 		String str = "abc"; // 대입연산자로 객체화
 		String str = new String("abc"); // 객체화
 	
 	3. 문자열에 관련된 다양한 메소드를 멤버로 가짐
 		
 	
 */
public class OpEx7 {
	public static void main(String[] args) {	
		System.out.println(1 +2.5 + 3 + "값");
		System.out.println("" + 1 +2.5 + 3 + "값");
		System.out.println("값" + 1 + 2.5 + 3);
	}
}
