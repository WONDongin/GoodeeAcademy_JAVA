package test;
/*
 *  LambdaInterface2를 이용하여 1부터 100까지의 임의의 수 10개를
 *  배열에 저장하고, 그중 짝수,홀수를 구분하여 출력하고,
 *  함수 객체에 의해서 짝수의 합 또는 홀수의 합을 출력하는 numSum 메서드를 구현하기
 *  
 *  [결과]
    3,73,83,40,52,45,43,33,26,6,
    홀수 :3,73,83,45,43,33,=280
    짝수 :40,52,26,6,=124
 */

interface LambdaInterface2 {
	boolean method(int a);
}
public class Test05 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
			System.out.print(arr[i] + ",");
		}
		System.out.println();
		System.out.print("홀수의 합:");
		numSum(a -> a % 2 != 0, arr);
		System.out.print("짝수의 합:");
		numSum(a -> a % 2 == 0, arr);
	}
	// 함수 , 1~100까지 랜덤(10개 숫자)
	private static void numSum(LambdaInterface2 f, int[] a) {
		int sum = 0; // 합
		StringBuilder sb = new StringBuilder(); // 문자열 저장
		
		for(int num : a) {
			if(f.method(num)) { // 조건을 통과하는 숫자만 처리
				sb.append(num).append(","); // 문자열 : 숫자 , (저장)
				sum += num; // 숫자 합산
			}
		}
		
		if(sb.length() > 0) { // 숫자가 하나 이상 추가되었을때
			sb.setLength(sb.length() - 1); // 문자열 마지막 , 삭제
			// setLength(남은길이) : 문자열 뒷부분을 잘라 길이 조정
		}
		
		System.out.println(sb.toString() + "=" + sum);
	
	}

}
