package chap5;
/*
 	command 라인에서 숫자를 입력받아 숫자의 각 자리수 합을 출력하기
 	
 	java Exam04 1234
 	1+2+3+4 = 10
 */
public class Exam04 {
	public static void main(String[] args) {
		
		if(args.length == 0) {
			System.out.println("숫자로된 파라미터를 command 라인에 입력하세요");
			return;
		}
		
		
		for(int i = 0; i <args.length; i++ ) {
			int sum = 0;	
			// str : 문자열 객체의 참조변수
			// args : 문자열 객체의 배열의 참조변수
			String str = args[i]; // 1234
			for(int j = 0; j < str.length(); j++) {
				char ch = args[i].charAt(j);
				if(ch >= '0' && ch <= '9') {
					sum += ch - '0';
				}
			}
			
			System.out.println(args[i] + "의 자리수 합 : " + sum);
		}
		
	}
}
