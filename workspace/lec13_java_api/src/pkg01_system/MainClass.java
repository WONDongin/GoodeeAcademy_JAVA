package pkg01_system;

public class MainClass {
	public static void main(String[] args) {
		
		// 타입스탬프 : 1970-01-01  0:0:0 시간부터 현재까지 1/1000초 단위로 증가하고 있는 값
		long timestamp = System.currentTimeMillis();
		System.out.println(timestamp);
		
		
		// 나노타임 : 나노초(1/10억) 단위 시간을 알려주는 값, 2개 값을 사용해야 의미가 있음
		
		// 시작시간
		long start = System.nanoTime();
		// 시간을 측정하고 싶은 작업
		System.out.println("Hello World");
		
		// 종료시간
		long stop = System.nanoTime();
		
		System.out.println(stop - start);
		
		// 배열 복사
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = new int[10];
		
		System.arraycopy(arr1, 2, arr2, 3, 3); // arr1[0] 부터 ~ arr2[0]으로 보내기 , 5개
		for(int arr : arr2) {
			System.out.print(arr);
		}
		
	}
}
