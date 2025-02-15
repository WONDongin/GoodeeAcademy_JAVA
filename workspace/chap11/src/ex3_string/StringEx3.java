package ex3_string;

public class StringEx3 {
	public static void main(String[] args) {
		String str = "ABC123"; // x001
		System.out.println("main: " + str);
		str =  change(str); // 변경된 값을 리턴받는다.
		System.out.println("change 후: " + str);
	}
	
	public static String change(String str) {
		str += 456;
		System.out.println("change : " + str);
		return str; // 변경된 값 전달
	}
}
