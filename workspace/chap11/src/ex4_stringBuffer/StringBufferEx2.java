package ex4_stringBuffer;
/*
StringBuffer 클래스의 주요 메서드 
sb : abc123afalse
sb : ABCDEFG
*/
public class StringBufferEx2 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		// 객체의 마지막에 추가
		sb.append("abc").append(123).append('A').append(false); 
		System.out.println(sb); // abc123afalse
		
		sb.delete(2, 4); // c1 : 2번 인덱스부터 3번 인덱스까지 문자 제거
		System.out.println(sb); // ab23Afalse
		
		sb.deleteCharAt(4); // A : 4번 인덱스 문자 제거
		System.out.println(sb); // ab23false
		
		sb.insert(5, "=="); // 5번 인덱스에 == 추가
		System.out.println(sb); // ab23f==alse
		
		sb = new StringBuilder("ABCDEFG"); // 새로운 객체 생성
		// 0 ~(3-1) 인덱스를 abc로 치환
		sb.replace(0, 3, "abc");
		System.out.println(sb);  // abcDEFG
		
		sb.reverse(); // 문자열 역순배치
		System.out.println(sb); // GFEDcba
	}
}
