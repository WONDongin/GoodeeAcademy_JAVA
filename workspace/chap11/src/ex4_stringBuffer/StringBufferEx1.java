package ex4_stringBuffer;
/*
StringBuffer / StringBuilder 클래스 : 동적 문자열 
- 같은 메서드를 멤버로 가진다.
	StringBuffer : 기존클래스. 스레드의 동기화된 메서드를 멤버로 가진다.
	StringBuilder : jdk5.0 이후에서 사용가능한 클래스, 스레드의 비동기화된 메서드를 멤버로 가진다.
	
- equals 메서드가 오버라이딩 되어 있지 않음. 내용비교 안됨.
=> 내용 비교를 위해서 String 객체로 변경(toString())하여 비교해야 함. 
- 동적문자열. String(문자열) 클래스의 보조클래스로 사용함.
*/
public class StringBufferEx1 {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		System.out.println("sb1 == sb2 : " + (sb1 == sb2)); // 같은 객체 여부
		// equals() : 내용 비교를 위해서 오버라이딩 되어 있지 않음.
		System.out.println("sb1.equals(sb2) : " + (sb1.equals(sb2)));
		// 내용비교를 위해서는 문자열 변환이 필요
		System.out.println("sb1.toString().equals(sb2.toString()) : " + (sb1.toString().equals(sb2.toString())));
		
		StringBuilder sb3 = new StringBuilder("abc");
		StringBuilder sb4 = new StringBuilder("abc");
		System.out.println("sb3 == sb4 : " + (sb3 == sb4)); // 같은 객체 여부
		// equals() : 내용 비교를 위해서 오버라이딩 되어 있지 않음.
		System.out.println("sb3.equals(sb4) : " + (sb3.equals(sb4)));
		// 내용비교를 위해서는 문자열 변환이 필요
		System.out.println("sb3.toString().equals(sb4.toString()) : " + (sb3.toString().equals(sb4.toString())));
	
	}
}
