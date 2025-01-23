package pkg02_loop;

public class While {
	public static void main(String[] args) {
		
		//while(조건식)
		
		int num = 1;
		while (num < 6) {
			System.out.println(num);
			num++;
		}
		
		//do while 문
		int b = 10;
		
		do {
			System.out.println(b);
			b += 10;
		} while(b < 60);
		
		
	}	
}
