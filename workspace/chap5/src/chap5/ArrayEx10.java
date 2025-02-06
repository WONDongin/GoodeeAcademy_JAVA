package chap5;

import java.util.Arrays;

/*
 	배열의 크기 변경은 불가.
 	새로운 배열 객체 생성하여 배열 요소값을 복사
 	1. for 구문을 이용하여 값을 복사
 	2. System.arraycopy() 함수 이용
 	
 */
public class ArrayEx10 {
	public static void main(String[] args) {
		int[] arr1 = {10, 20, 30};
		// arr1 배열보다 하너 더 큰 배열을 생성하여 arr1의 배열값을 저장하고 합계를 마지막 요소에 저장
		// arr1.length = 4; 크기변경 불가.
		int[] arr2 = new int[arr1.length+1];
		
		// for 구문으로 배열의 값 복사하기
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
			arr2[arr1.length] += arr1[i];
		}
		
		for (int a : arr2) {
			System.out.print(a + ",");
		}
		System.out.println();
		
		// 2. Ststem.arraycopy() 함수 사용 방식
		int[] arr3 = new int[10];
		/*
		 arrcopy(원본배열, 원본배열의 시작 인덱스값, 복사본배열, 복사배열의 시작 인덱스값, 요소의 갯수)
		 arr2 : 10 20 30 60
		 arr3 :   0   0 10 20 30 60  0   0   0   0 
		 */
		System.arraycopy(arr2, 0, arr3, 2, arr2.length);
		
		for(int a : arr3) {
			System.out.print(a + ",");
		}
		System.out.println();
		
		// 3. Arrays.copyOf() 함수 사용 방식
		// Arrays.copyOf(원본배열, 갯수)
		int[] arr4 = Arrays.copyOf(arr3, 5);
		for(int a : arr4) {
			System.out.print(a + ",");
		}
		System.out.println();
		
		int[] arr5 = arr4; // 얕은복사. 두개의 참조변수가 한개의 객체 참조
		for(int a : arr5) { // arr4와 같은 객체
			System.out.print(a + ",");
		}
		System.out.printf("\narr1 : ");
		for(int a : arr1) {
			System.out.print(a + ",");
		}
		
		System.out.printf("\narr2 : ");
		for(int a : arr2) {
			System.out.print(a + ",");
		}
		
		System.out.printf("\narr3 : ");
		for(int a : arr3) {
			System.out.print(a + ",");
		}
		
		System.out.printf("\narr4 : ");
		for(int a : arr4) {
			System.out.print(a + ",");
		}
		
		
	
	}
}
