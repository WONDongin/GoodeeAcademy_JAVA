package chap4;

import java.util.Scanner;

/*
 	1, 2, 3 중 한개의 임의의 값을 생성하여
 	1 : 가위
 	2 : 바위
 	3 : 보자기
 	출력하기
 	
 		시스템     	사용자 
 	    가위          바위     	짐
  		바위          가위     	이김
  		보자기       보자기     비김
 	
 */
public class Exam03 {
	public static void main(String[] args) {
		
		System.out.println("1(), 2(), 3() 중 선택하세요: ");
		Scanner scan = new Scanner(System.in);
		int num3 = scan.nextInt();
		
		switch (num3) {
		case 1: System.out.println("1"); break;
		case 2: System.out.println("2"); break;
		case 3: System.out.println("3"); break;
		}
		
		int num4 = (int) (Math.random() * 3) + 1; // 1~ 3사이의 임의 의 수
		
		switch (num4) {
		case 1: System.out.println("1"); break;
		case 2: System.out.println("2"); break;
		case 3: System.out.println("3"); break;
		}
		
		if(num3 == num4 ) {System.out.println("같다.");}
		
		switch (num4) {
		case 1: if(num3 > num4) {System.out.println("크다.");}
					if(num3 < num4) {System.out.println("작다.");}
					break;
		case 2: if(num3 > num4) {System.out.println("크다.");}
					if(num3 < num4) {System.out.println("작다.");}
					break;
		case 3 : if(num3 > num4) {System.out.println("크다.");}
					if(num3 < num4) {System.out.println("작다.");}
					break;
		}
		
	}
}
