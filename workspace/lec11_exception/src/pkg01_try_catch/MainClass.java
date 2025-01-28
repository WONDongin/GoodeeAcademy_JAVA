package pkg01_try_catch;

public class MainClass {
	public static void main(String[] args) {
		
		try {
			
			int a = 5;
			int b = 0;
			
			System.out.println(a + b);
			System.out.println(a - b);
			System.out.println(a * b);
			System.out.println(a / b);
			System.out.println(a % b);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
}
