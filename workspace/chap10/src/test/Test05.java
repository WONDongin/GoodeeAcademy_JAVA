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

	private static void numSum(LambdaInterface2 f, int[] a) {

		
	}
}
