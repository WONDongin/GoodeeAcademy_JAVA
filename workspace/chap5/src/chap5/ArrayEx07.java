package chap5;

import java.util.Iterator;

/*
 	2차원 배열 예제
 	2차원 배열은 1차원 배열의 참조변수의 배열. 배열의 배열이다. 
 */
public class ArrayEx07 {
	public static void main(String[] args) {
		int[][] arr = new int[3][2]; 
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[1][0] = 30;
		arr[1][1] = 40;
		arr[2][0] = 50;
		arr[2][1] = 60;
		// 참조변수의 배열 : 배열의 배열의 배열의 ... (1차, 2차, 3차
		
		// arr.length : 3
		for(int i = 0; i < arr.length; i++) {
			// arr[i].length : 2
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print("arr[" + i + "] [" + j + "]= " + arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("1차원 배열의 객체 변경하기");
		int[] arr1 = {5, 6, 3, 4, 5, 9};
		arr[1] = arr1; // 기본 참조값(객체) 없애고 신규 등록
		arr[2] = new int[] {100, 200, 300};
 		for(int i = 0; i < arr.length; i++) { // 0
			// arr[0].length : 2
			// arr[1].length : 5
			// arr[2].length : 3
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print("arr[" + i + "] [" + j + "]= " + arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
