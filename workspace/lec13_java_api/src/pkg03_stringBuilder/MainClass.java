package pkg03_stringBuilder;

public class MainClass {
	
	public static void main(String[] args) {
		// StringBuilder 클래스
		StringBuilder sb = new StringBuilder();
		
		// 문자열 추가
		sb.append("hello");
		sb.append("world");
		sb.append("nice").append("to").append("meet").append("you");
		
		System.out.println(sb);
		
		// String 클래스 타입으로 변환
		System.out.println(sb.toString());
		System.out.println(new String(sb));
	
		
	}
}
