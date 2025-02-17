package test;

import java.util.Random;

/*
 * int getRand(f,t) : 함수 구현하기
 *   f ~ t 또는 t~ f 까지  범위에 숫자를 임의의 수로 리턴하는 함수
 *   f, t 값은 포함됨. 
 
[결과]
-2,1,0,-3,-2,1,-1,0,-2,0,0,1,0,-3,0,-1,-1,-2,-2,1,
3,3,0,0,-1,-1,0,3,2,3,0,-1,1,1,-1,3,0,0,1,-1,    
 */
public class Test10 {
	public static void main(String[] args) {
		for(int i=0;i<20;i++) {
			System.out.print(getRand(1,-3)+",");
		}
		System.out.println();
		for(int i=0;i<20;i++) {
			System.out.print(getRand(-1,3)+",");
		}
	}

	public static int getRand(int f, int t) {
    	Random rand = new Random(); // Random 객체 생성

        // 범위 계산 (f가 t보다 클 수도 있으므로 min, max 구분)
        int min = Math.min(f, t); // 두 값 중 작은 값
        int max = Math.max(f, t); // 두 값 중 큰 값

        // min ~ max 범위의 랜덤 정수 생성
		// rand.nextInt(n)은 0 이상 n 미만 (0 ~ n-1) 의 정수를 반환하는 메서드
		// max - min + 1을 사용해 원하는 개수만큼 랜덤 숫자 생성
		// + min을 해서 원하는 시작 숫자로 조정
        return rand.nextInt(max - min + 1) + min;
    }
}
