package pkg02_throw;

public class MainClass {
	public static void main(String[] args) {
		
		// 점수에 따른 학점 계산
		
		try {
			
			int score = -100; // 0 ~ 100
			
			if(score < 0 || score >100) {
				// throw 문 : 예외를 직접 만들고, 던질 때 사용
				throw new RuntimeException(score + "점은 불가능한 점수 입니다.");
			}
			
			String grade = null;
			
			if(score >= 90) {
				grade = "A";
			} else if (score >= 80) {
				grade = "B";
			} else {
				grade = "C";
			}
			
			System.out.println("점수 : " + score + "점, 학점: " + grade + "입니다.");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
}
