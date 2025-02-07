package ex2_method;
/*
 	Rectangle 클래스를 이용하여 20 ~ 50사이의 임의의 가로, 세로 길이를 가진 사각형을 5개 생성하여
 	사각형 정보를 출력하고
 	전체 사각형의 면적의 합과 둘레의 합을 출력하기
*/

public class Exam02 {
	public static void main(String[] args) {
		// 클래스 배열
		Rectangle[] arr = new Rectangle[5];
		// arr[0] : Rectangle 형의 참조변수. 객체 아님
		
		int totArea = 0, totLen = 0;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = new Rectangle(); // Rectangle 객체 생성
			arr[i].width = (int) (Math.random() * 31) + 20;
			arr[i].height = (int) (Math.random() * 31) + 20;
			arr[i].serialNo = ++Rectangle.cnt;
			System.out.println(arr[i]);
			totArea += arr[i].area();
			totLen += arr[i].length();
		}
		
		System.out.println("전체 면적의 합 : " + totArea);
		System.out.println("전체 둘레의 합 : " + totLen);
		System.out.println("전체 면적의 평균 : " + (double) totArea / arr.length);
		System.out.println("전체 둘레의 평균 합 : " +  (double) totArea);

	}
}
