package pkg05_return;

public class Member {
	// 반환 없음 : void
	// 반환 있음 : int, long, double, boolean, ...
	
	// 반환 없는 경우와 return
	// return; : 메소드 종료
	public void method1(int a) {
		if(a < 0) {
			return;
		}
		System.out.println(a);
	}
	
	// 반환 있는 경우와 return
	public  int method2(int a) {
		return a + 1; // 반환 값 a + 1
	}
}
