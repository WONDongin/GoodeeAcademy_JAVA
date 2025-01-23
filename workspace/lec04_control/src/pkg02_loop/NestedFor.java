package pkg02_loop;

public class NestedFor {
	public static void main(String[] args) {
		
		// 구구단 전체 출력하기
		for(int x = 2; x <= 9; x++) {
			System.out.println("===" +  x +"단 ===");
			for(int y = 1; y <= 9; y++) {
				System.out.println(x + "x" + y + "=" + (x*y));
			}
		}
	}
}
