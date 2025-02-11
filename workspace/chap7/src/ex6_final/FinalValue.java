package ex6_final;

import java.util.Arrays;

/*
 * final 변수 : 변경불가변수 => 상수. const 예약어 사용안함.
 * final 변수도 생성자에서 한번은 초기화 가능함 => 객체별로 다른 상수값이 가능
 * 단 명시적 초기화를 하면 안됨.
 */
public class FinalValue {
	final int NUM;  //상수
	FinalValue(int num) {
		NUM = num; //상수값 초기화.
//		NUM = num;
	}
	public static void main(String[] args) {
		final int NUM = 100;
//		NUM = 200; //오류. 변경불가 변수
		FinalValue f1 = new FinalValue(100);
		FinalValue f2 = new FinalValue(200);
//		f1.NUM=1000;
		System.out.println(f1.NUM); //100
		System.out.println(f2.NUM); //200
		
		final int[] arr = {10,20,30,40,50};
		arr[0] = 100;
		arr[1] = 200;
		System.out.println(Arrays.toString(arr));
		// arr = new int[]{100,200,300};
	}
}