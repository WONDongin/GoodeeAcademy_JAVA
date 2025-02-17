package test;
/*
 * 문자열 1,234를 정수로 변경하여  * 10 한 값을 세자리마다 , 찍어 출력하기 
 * [결과]
 * 12,340
 */
public class Test07 {
	public static void main(String[] args) {
		String str = "1,234";
		String[] arr = str.split(",");
		
		StringBuilder sb4 = new StringBuilder(str);
		
		
		System.out.println( sb4.toString());

	
	}
}
