package ex3_string;
/*
String 클래스
- 정적인 문자열, 변경 불가 문자열 객체
- + 연산자 가능한 유일한 클래스
- 대입연산자를 이용하여 객체 생성이 가능한 유일한 클래스
- final 클래스 : 다른 클래스의 부모클래스는 불가. 최종 클래스
*/
public class StringEx1 {
	public static void main(String[] args) {
		String s1 = "abc"; // 상수 풀에 저장
		String s2 = "abc";
		System.out.println("s1 == s2 : " + (s1 == s2));
		System.out.println("s1.equals(s2) : " + s1.equals(s2));
		
		String s3 = new String("abc"); // 객체 생성
		String s4 = new String("abc");
		System.out.println("s3 == s4 : " + (s3 == s4));
		System.out.println("s3.equals(s4) : " + s3.equals(s4));
		
		System.out.println("System.identityHashCode(s1) : " + System.identityHashCode(s1));
		System.out.println("System.identityHashCode(s2) : " + System.identityHashCode(s2));
		System.out.println("System.identityHashCode(s3) : " + System.identityHashCode(s3));
		System.out.println("System.identityHashCode(s4) : " + System.identityHashCode(s4));

	}
}
