package ex3_string;
/*
 
*/
public class StringEx2 {
	public static void main(String[] args) {
		String s = new String("ABCDEFGH");
		// s.charAt(4) : s 문자열 중 4번 인덱스에 해당하는 문자 리턴
		System.out.println(s.charAt(4)); // E
		// s.compareTo("abc") :  s 문자열과 "abc" 문자열을 비교하여 차이값을 정수로 리턴
		// 정렬에 사용되는 메서드.
		// 결과값이 양수 : s 문자열이 "abc" 문자열 뒤
		// 결과값이 음수 : s 문자열이 "abc" 문자열 앞
		System.out.println(s.compareTo("abc")); // -32
		// IgnoreCase : 대소문자 상관없이
		System.out.println(s.compareToIgnoreCase("abcdefgh")); //0 : 동일하다.
		System.out.println();
		// 마지막 문자열이 GH ?
		System.out.println(s.endsWith("GH")); // true
		// 시작 문자열이 AB ?
		System.out.println(s.startsWith("AB")); // true
		System.out.println();
		// 내용비교
		System.out.println(s.equals("ABCDEFGH")); // true
		// 내용비교(대,소문자 상관없이)
		System.out.println(s.equalsIgnoreCase("abcdefgh")); // true
		System.out.println();
		s = "This is a String";
		// s.indexOf("i") : i 문자의 인덱스 값 리턴.
		System.out.println(s.indexOf("i")); // 2
		System.out.println(s.indexOf("is")); // 2
		// s.lastIndexOf("i") : i 문자열의 뒤 우선 검색. 인덱스 값 앞쪽부터
		System.out.println(s.lastIndexOf("i")); // 13
		// s.indexOf('i', 3) : 3번 인덱스 부터 i 문자의 인덱스 값 리턴.
		System.out.println(s.indexOf('i', 3)); // 5
		System.out.println();
		// 문자열의 길이 리턴
		System.out.println(s.length()); // 16
		System.out.println();
		// 문자열 치환
		System.out.println(s.replace("is", "QR")); // ThQR QR a String
		// 정규식을 활용한 문자열 치환
		System.out.println(s.replaceAll("is", "QR")); // ThQR QR a String
	}	
}
