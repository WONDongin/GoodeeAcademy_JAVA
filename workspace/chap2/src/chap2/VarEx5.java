package chap2;
/*
 	특수문자 : \
 */
public class VarEx5 {
	public static void main(String[] args) {
		char single = '\''; // 작은 따옴표 저장 (\')
		System.out.println(single);
		
		String str = "홍길동이 말했습니다. \"안녕\"";
		System.out.println(str);
		
		String dirString = "c:\\";
		System.out.println(dirString);
		
		// \t : tab 표시
		System.out.println("서울\t대전\t대구\t부산"); 
		// \n : 다음줄
		System.out.println("안녕하세요\n다음줄에 출력합니다.");
		// \ u : 유니코드. 2byte 문자. \ u16진수 코드값. 홍(D64D)
		System.out.println("\uD64D");
	}
}
