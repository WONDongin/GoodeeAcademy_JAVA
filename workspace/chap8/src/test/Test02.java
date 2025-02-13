package test;
//다음 소스는 컴파일 오류가 발생한다. 결과가 "Tested" 가 출력되도록 프로그램을 수정하기
interface Beta {}  //멤버가 없다.

class Alpha implements Beta {
	String testIt() {
		return "Tested";
	}
}
class Gamma implements Beta {
	String testIt1() {
		return "Gamma";
	}
}

public class Test02 {
	static Beta getIt() {
		return new Alpha();
	}
	public static void main(String[] args) {
		Beta b = getIt();
		// System.out.println(  ((Alpha)b).testIt()  );
		Alpha a = ((Alpha)b);
		System.out.println(a.testIt());
	}
}
