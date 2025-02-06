package chap5;
/*
 	arr 2차원 배열의 행의 합과 열의 합을 출력하기
 */
public class Exam05 {
	public static void main(String[] args) {
		int[][] arr = new int[3][2];
		// arr.length : 3
		// arr[0].length : 2
		// arr 변수는 2차원 배열의 참조변수. 1차원 배열의 참조변수가 3개를 저장한 배열 객체
		// arr[0] 1차원 배열의 잠조변수
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[1][0] = 30;
		arr[1][1] = 40;
		arr[2][0] = 50;
		arr[2][1] = 60;
		arr[1] = new int[] {100, 200, 300};
		
		System.out.println("행의 합 =====");

		for(int i = 0; i < arr.length; i++) {
			System.out.print(i + "행의 합: ");
			int sum = 0;
			for(int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
			System.out.println(sum);
		}
		
		System.out.println("열의 합 =====");
		
		int col[] = new int[3];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				col[j] += arr[i][j];
			}
		}
		
		for(int i = 0; i <col.length; i++) {
			System.out.println(i + "열의 합: " + col[i]);
		}
	}
}
