package chap2;
/*
 	문자형(기본자료형) : char => 한개의 문자만 저장  / 작은 따옴표 ' ' 표현
 	문자열형(참조자료형) : String => 0개 이상의 문자들을 저장 /  큰따옴표 " "표현
 */

public class VarEx2 {
	public static void main(String[] args) {
		// char c1 = '';  빈문자 안됨.
		char c1 = ' '; // 공백문자도 한개의 문자임
		char c2 = 'A'; // 한개의 문자 저장 가능
	    // char c3 = 'AB'; 두개의 문자 불가능
		
		String s1 = " "; // 빈문자열 가능
		String s2 = "A"; // 한개의 문자열 가능
		String s3 = "AB"; // 두개의 문자열 가능
		
		System.out.println("c1=" + c1);
		System.out.println("c2=" + c2);
		// System.out.println("c3=" + c3);  c3변수가 선언이 안됨
		System.out.println("s1=" + s1);
		System.out.println("s2=" + s2);
		System.out.println("s3=" + s3);
		
		// 변수 선언이 되어야 변수 사용이 가능
		
		// int true = 100; >  예약어 불가
		int True = 100;
		// int 7up = 7; > 숫자 시작 안됨
		int top10 = 100;
		char _id = 'A';
		char $harp = 'B';
	}
}
