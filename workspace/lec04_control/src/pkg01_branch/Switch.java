package pkg01_branch;

public class Switch {
	public static void main(String[] args) {
		
		// switch(표현식)
		// case 값1: 실행문;
		// case 값2: 실행문;
		// ...
		// default: 실행문;
		
		int choice = 3;
		
		switch (choice) {
		case 1: System.out.println("선택1"); 
		break;
		case 2: System.out.println("선택2"); 
		break;
		case 3: System.out.println("선택3");
		break;
		}
	}
}
