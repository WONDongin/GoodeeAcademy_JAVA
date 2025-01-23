package pkg01_branch;

public class If {
	public static void main(String[] args) {
		
		// 형식 if(조건식)
		int score = 99;
		char grade = '0';
		
		if(score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.println("점수: " + score + ", 등급: " + grade);
	}
}
