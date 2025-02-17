package test;
/*
 * format 메서드 구현하기
 * 메서드명 : String format (String str,int len,int align)
 * 기능 : 주어진 문자열을 지정된 크기의 문자열로 변환.
 *        나머지 공간은 공백으로채운다.
 *      (0 : 왼쪽 정렬, 1: 가운데 정렬, 2:오른쪽 정렬)     
 [결과]
 가나다    
  가나다  
    가나다
가나 
 */
public class Test08 {
	public static void main(String[] args) {
		String str = "가나다";
		System.out.println(format(str, 7, 0)); // 왼쪽 정렬
		System.out.println(format(str, 7, 1)); // 가운데 정렬
		System.out.println(format(str, 7, 2)); // 오른쪽 정렬
		System.out.println(format(str, 2, 0)); // 주어진 길이가 문자열보다 짧은 경우
	}

	public static String format(String str, int len, int align){
		// str의 길이가 len보다 크거나 같으면, len 길이만큼 잘라서 반환
		if(str.length() >= len){
			return str.substring(0, len);
		}
		// 문자열의 길이가 len 보다 짧다면, 부족한 길이 padding 에 저장 후 공백추가
		int padding = len - str.length();

		// align 값 (0, 1, 2)에 따라 다른 정렬방식 수행
		/*
		str.repeat(n) : 주어진 횟수만큼 문자열을 반복한 새 문자열을 반환
		Java11에서 새로 추가된 String 메서드입니다.
		n이 0이거나 str이 비어있으면 빈 문자열이 반환됩니다.
		n이 음수이면 IllegalArgumentException이 발생합니다.
		n이 1이면 str을 그대로 반환합니다.
		*/
		switch (align) {
			case 0 : 
				return str + " ".repeat(padding);
			case 1 :
				return " ".repeat(padding / 2) + str + " ".repeat(padding - padding / 2);
			case 2 :
				return " ".repeat(padding) + str;
			// 예외처리 : align 값이 0, 1, 2 아니라면 예외발생
			default :
				throw new IllegalArgumentException("align 값은 0, 1, 2 중 하나여야 합니다.");
		}
	}
}
