package chap4;
/*
 	중첩 if 문 : if 구문 내에 if 구문이 존재함
 */
public class IfEx03 {
	public static void main(String[] args) {
		int score = 85;
		
		if(score >= 60) {
			System.out.println("합격 입니다.");
			if(score >= 80) {
				System.out.println("좋은 성적입니다.");
			}
		} else {
			System.out.println("불합격 입니다.");
		}
	}
}
