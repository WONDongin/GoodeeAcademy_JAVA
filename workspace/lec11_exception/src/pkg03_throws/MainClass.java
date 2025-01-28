package pkg03_throws;

public class MainClass {
	public static void main(String[] args) {
		
		try {
			
			Calculator character = new Calculator();
			character.calculate(5, 0);
			
		} catch (ArithmeticException e) {
			
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
}
