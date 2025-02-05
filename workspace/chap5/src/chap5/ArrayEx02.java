package chap5;
/*
 	배열의 선언, 생성, 초기화 하기
 	
 	하나의 객체는 여러개의 참조변수가 참조 있다.
 	하나의 참조변수는 여러개의 객체를 참조 할 수 없다. 하나의 참조변수는 한개의 객체만 참조 가능하다.
 */
public class ArrayEx02 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		
		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
		// 인덱스 출력 arr[0] = 10;
		for(int i =0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
		
		// arr 배열 객체를 변경. 생성, 초기화 방식
		arr = new int[] {100, 200, 300};
		for(int i =0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
	}
}
