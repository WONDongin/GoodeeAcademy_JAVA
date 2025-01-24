package pkg01_array;

public class MainClass {
	public static void main(String[] args) {
		
		// 배열 선언 : 데이터 타입 + 배열 이름(배열의 생성을 의미하지 않는다.)
		int[] arr;
		
		// 배열 생성 : 배열의 길이를 결정해서 실제 메모리 공간을 할당 받는 과정
		arr = new int[3];
		
		// 배열의 길이 : 배열의 생성 이후 배열 길이는 수정 불가
		System.out.println(arr.length);
		
		// 인덱스 : 배열 요소들의 위치 정보. 0~ 배열 길이 -1
		
		// 배열요소 : 배열을 구성하는 각각의 변수. 배열 생성 시 자동으로 0(int 기준)으로 초기화
		// 형식 : 배열이름[인덱스]
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		
		// 배열 초기화 (선언할때만 가능한 초기화)
		String[] seasons = {"spring", "summer", "autumn", "winter"};
		System.out.println(seasons[0]);
		System.out.println(seasons[1]);
		System.out.println(seasons[2]);
		System.out.println(seasons[3]);
		
		// 배열 초기화 (선언 이후에도 가능한 초기화)
		String[] hobbies;
		hobbies = new String[] {"game", "travel", "golf"};
		System.out.println(hobbies[0]);
		System.out.println(hobbies[1]);
		System.out.println(hobbies[2]);
	}
}
