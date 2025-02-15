package chap4;
/*
 	break : 반복문, switch 구문 중단
 	continue : 반복문의 처음으로 제어 이동
 */
public class LoopEx04 {
	public static void main(String[] args) {
		for(int i = 2; i <= 9; i++) { // 2
			System.out.println("===" + i + "단 ===");
			for(int j = 2; j <= 9; j++) { // 5
				if(j == 5) continue;
				System.out.printf("%d * %d = %3d\n", i, j, i*j);
			}
		}
	}
}
