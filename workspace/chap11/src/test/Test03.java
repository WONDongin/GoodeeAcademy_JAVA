package test;
/*
 * 다음 결과가 나오도록 프로그램 수정하기
 * [결과]
 * basket
 * basketball
 * 
 * main : str = "base"
 *            str = basket 
 *             			
 */
public class Test03 {
	public static void main(String[] args) {
		String str = "base"; 
		// System.out.println(str.replace('e','k')+"et");
		System.out.println(str =  str.replace('e','k')+"et");
		str += "ball"; 
		System.out.println(str);
	}
}
