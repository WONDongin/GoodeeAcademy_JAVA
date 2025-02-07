package test;
/*
command line에서 숫자로 이루어진 문자를 두개 받아서 두수의 공약수를 구하시오
int num1 = Integer.parseInt(args[0])

[결과]
10과 20 의 공약수 : 1,2,5,10,

*/
public class Test14 {
	public static void main(String[] args) {
		
		// 입력값 2개가 맞는지 확인
		if (args.length < 2) {
            System.out.println("두 개의 숫자를 입력하세요.");
            return;
        }

		// 입력값 저장
        int num1 = Integer.parseInt(args[0]);  // 첫 번째 숫자
        int num2 = Integer.parseInt(args[1]);  // 두 번째 숫자

        System.out.print(num1 + "과 " + num2 + "의 공약수 : ");

        // 두 수 중 작은 값을 찾음 (Math 메서드의 min 사용) 
        // - 반복문 더 효율적으로 돌리기 위해서
        int min = Math.min(num1, num2);

        // num1 , num2 의 공약수 구하기
        for (int i = 1; i <= min; i++) {
        	// num % i == 0 (약수 공식)
            if (num1 % i == 0 && num2 % i == 0) { // 공약수
                System.out.print(i);
                if (i != min) {
                    System.out.print(",");
                }
            }
        }
        System.out.println();
	}
}
