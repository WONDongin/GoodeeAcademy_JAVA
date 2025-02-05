package test;

import java.util.Scanner;
/*
 *  농장에 강아지,병아리가 있음.
 *  강아지 병아리 전체 마리수 입력받고
 *  강아지 다리수와 병아리 다리수 전체를 입력받는다.
 *  [결과]
 *  강아지 병아리 마리수를 입력하세요
 *  20
 *  강아지 병아리 전체 다리수를 입력하세요
 *  30
 *  
 *  강아지 : xx마리
 *  병아리 : yy마리
 *  
 *  x + y = 전체 마리수
 *  4x + 2y = 전체 다리수
 *  방정식
 *  
 *  
 *  [결과]
 *  강아지 병아리 마리수를 입력하세요
 *  10
 *  강아지 병아리 전체 다리수를 입력하세요
 *  10
 *   
 *  계산안됨 
*/
public class Test01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    
		// 사용자 입력 받기
		System.out.println("강아지 병아리 마리수를 입력하세요");
	    int totalAnimals = scanner.nextInt();
	    System.out.println("강아지 병아리 전체 다리수를 입력하세요");
	    int totalLegs = scanner.nextInt();
	    
	    // 연립 방정식
	    /*
	     x + y = total
	     y = total - x
	     
	     4x + 2y = totalLegs
	     4x + 2(total - x) = totalLegs
	     4x + 2total - 2x = totalLegs
	     2x + 2total = totalLegs
	     2x = totalLegs - 2total
	     x = (totalLegs - 2 * total) / 2
	     */
	    int x = (totalLegs - 2 * totalAnimals) / 2; // 강아지
	    int y = totalAnimals - x; // 병아리
	    
	    if(x < 0 || y < 0 || 4*x + 2*y != totalLegs) {
	    	System.out.println("계산안됨");
	    } else {
			System.out.println("강아지: " + x + "마리");
			System.out.println("병아리: " + y + "마리");
		}
	    
	    scanner.close();
	}
}
