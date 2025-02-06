package chap5;

import java.util.Scanner;

/*
 	Exam07 예제와 같은 기능을 프로그램을 작성하는데
 	행의 크기를 입력받아서 처리
 */
public class Exam08 {
	public static void main(String[] args) {
		System.out.print("배열의 행을 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);
		int row = scanner.nextInt();

		// 1. 가변배열 생성
		int arr[][] = new int[row][];
		
		// 2. 각 행의 1차원 배열의 객체 생성
		for(int i = 0; i < arr.length; i++) {
			arr[i] = new int[i+1];
		}	
		
		int num = 0;
		
		// 3. arr 배열에 숫자값 저장하기
		for(int j = arr.length-1; j >= 0; j--) {
			for(int i = j; i < arr.length; i++) {
				arr[i][j] = ++num; 
			}
		}
	
		// 4. 화면 출력
		for(int[] ar : arr) {
			for(int a : ar) {
				System.out.printf("%5d", a);
			}
			System.out.println();
		}
	}
}
