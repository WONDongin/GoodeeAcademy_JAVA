package chap5;

import java.util.Iterator;


/*
 	str 문자열에 저장된 소문자의 갯수 출력하기
 	
 */
public class Exam03 {
	public static void main(String[] args) {
		String str = "public static void main(String[] args)";
		
		// char[] alpha = str.toCharArray(); 
		int[] cntArr = new int[26];
		
		/*
		for(int i = 0;  i < alpha.length; i++) {
			char ch = alpha[i];
			if(ch >= 'a' && ch <= 'z') { // 소문자
				cntArr[ch - 'a']++;
			}
		}
		*/
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >= 'a' && ch <= 'z') { // 소문자
				cntArr[ch - 'a']++;
			}
		}
		
		for(int i = 0; i < cntArr.length; i++) {
			System.out.print((char) (i + 'a') + ":" + cntArr[i] + " =>");
			for(int j = 0; j < cntArr[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
