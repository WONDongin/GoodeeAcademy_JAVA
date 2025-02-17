package ex4_stringBuffer;
/*
delchar(원본문자열, 삭제대상문자열)
=> 원본문자열에서 삭제 대상 문자열을 제거하고 나머지만 출력 

*/
public class Exam1 {
	public static void main(String[] args) {
		System.out.println(delchar("(1!2@3$4~5)", "~!@#$%^&*()")); // 12345
		System.out.println(delchar("(1!2@3$4~5)", "12345")); // (!@$~)
		System.out.println(delchar2("(1!2@3$4~5)", "~!@#$%^&*()")); // 12345
		System.out.println(delchar2("(1!2@3$4~5)", "12345")); // (!@$~)
	}
	
	// StringBuilder
	private static StringBuilder delchar(String s1, String s2) {
		StringBuilder sb = new StringBuilder();

		for(int i = 0; i < s1.length(); i++) {
			/* if(s2.indexOf(s1.charAt(i)) < 0) {*/
			if(!s2.contains(s1.charAt(i) + "")) {
				sb.append(s1.charAt(i));
			}
		}
		return sb;
	}
	// String
	private static String delchar2(String s1, String s2) {
		String s = new String();

		for(int i = 0; i < s1.length(); i++) {	
			if(!s2.contains(s1.charAt(i) + "")) {
				s += s1.charAt(i);
			}
		}
		return s;
	}
}
