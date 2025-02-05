package chap5;

import java.util.Scanner;
import java.util.function.IntPredicate;

/*
 	정수 값을 5개을 입력받아서
 	입력 받은 수의 합계, 최대값, 최소값, 최대값 인덱스값, 최소값 인덱스 값 출력하하기
 */
public class Exam01 {
	public static void main(String[] args) {
		System.out.println("정수 값 5개를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		
		int[] arr = new int[5];
		int max = 0;
		int min = 0;
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
			sum += arr[i];
			
			if(arr[max] < arr[i]) {
				max = i;
			}
			
			if(arr[min] > arr[i]) {
				min = i;
			}
		}
		
		double avg = (double) (sum / arr.length);
		
	
		System.out.println("총합: " + sum);
		System.out.println("평균: " + avg);
		System.out.println("최대값: " + arr[max]);
		System.out.println("최대값의 인덱스" + max);
		System.out.println("최소값: " + arr[min]);
		System.out.println("최소값의 인덱스: " + min);
		
	}
}
