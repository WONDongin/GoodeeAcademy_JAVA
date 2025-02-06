package test;

/*
11*11 크기의 사각형이 있다고 가정할때 다음 결과를 출력되도록 프로그램 작성하기

X         X
 X       X
  X     X 
   X   X  
    X X   
     X    
    X X   
   X   X  
  X     X 
 X       X
X         X
 
*/
public class Test17 {
	public static void main(String[] args) {

		// 1. 가변배열 생성
		int arr[][] = new int[11][11];
		
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
