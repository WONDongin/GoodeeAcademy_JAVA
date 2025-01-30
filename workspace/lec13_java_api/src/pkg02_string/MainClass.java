package pkg02_string;

public class MainClass {
	
	public static void method1() {
		// 문자열 리터널
		String str1 = "my";
		String str2 = "my";
		System.out.println(str1 == str2);
		
		// 문자열 객체
		String str3 = new String("my");
		String str4 = new String("my");
		System.out.println(str3 == str4);
	}
	
	public static void method2() {
		String str1 = "MY";
		String str2 = new String("my");
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
	}
	
	public static void method3() {
		String str1 = " ";
		String str2 = "";
		
		// 글자수 
		System.out.println(str1.length());
		System.out.println(str2.length());
		
		// 글자수 검사
		System.out.println(str1.isEmpty()); // 글자수가 0이면 true
		System.out.println(str2.isEmpty());
		
		// 공백문자검사
		System.out.println(str1.isBlank()); // 공백문자로 구성되어 있으면 true
		System.out.println(str2.isBlank());
	}
	
	public static void method4() {
		String str = "abc.abc.abc";
		System.out.println(str.indexOf("."));  // 첫 번째 마침표(.)
		System.out.println(str.lastIndexOf(".")); // 마지막
		String str1 = "23/10/05";
		System.out.println(str1.lastIndexOf("/"));
	}
	
	public static void method5() {
		String str = "hello world";
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(str.length() - 1));
		
		int space = str.indexOf(" ");
		System.out.println(str.substring(0, space)); // 0 포함 space 불포함 범위
		System.out.println(str.substring(space + 1)); // space 포함  ~ 끝까지 범위		
	}
	
	public static void method6() {
		String str = "abcdfg";
		System.out.println(str.startsWith("a"));
		System.out.println(str.startsWith("ab"));
		System.out.println(str.endsWith("g"));
		System.out.println(str.endsWith("fg"));
		System.out.println(str.contains("cd"));
	}
	
	public static void main(String[] args) {
		method4();
	}
}
