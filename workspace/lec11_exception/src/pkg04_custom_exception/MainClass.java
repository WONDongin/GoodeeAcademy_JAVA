package pkg04_custom_exception;

public class MainClass {
	public static void main(String[] args) {
		
		try {
			
			throw new MyException("예외처리다 멍청아", 1);
			
		} catch (MyException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getErrorCode());
		}
		
	}
}
