package chap3;
/*
 	관계 연산자(비교 연산자) : ==. !=, >, < ...  결과가 boolean
 	
 	논리연산자 : &&(AND), ||(OR), > boolean && boolean > boolean
 		AND                 OR
 		T && T : T        T || T : T
 		T && F ; F        T || F : T
 		F && T : F        F || T : T
 		F && F : F        F || F : F
 		
 	&& :  앞쪽의 결과가 F인 경우 전체 결과 = F, 뒤쪽 부분 실행 X
 	||  : 앞쪽의 결과가 T인 경우 전체 결과 = T, 뒤쪽 부분 실행 X
 	
 	^(XOR) : 베타적 OR.
 	T ^ T : F
 	T ^ F : T
 	F ^ T : T
 	F ^ F : F 
 */

public class OpEx4 {
	public static void main(String[] args) {
		int x = 1, y = 1;
		System.out.println("1 == 1 : " + (x == y)); // t
		System.out.println("1 != 1 : " + (x != y)); // f
		System.out.println("1 > 1 : " + (x > y)); // f
		System.out.println("1 < 1 : " + (x < y)); // f
		System.out.println("1 <= 1 : " + (x <= y)); // t
		System.out.println("1 >= 1 : " + (x >= y)); // t
		
		// 논리연산자
		System.out.println("x==1 && y==2 : " + (x==1 && y==2)); // f
		System.out.println("x==1 || y==2 : " + (x==1 || y==2)); // t
		System.out.println("x==1 ^ y==2 : " + (x==1 ^ y==2)); // t
	}
}
