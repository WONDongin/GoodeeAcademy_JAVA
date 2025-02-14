package chap10;
// 예외 강제 발생
public class ExceptionEx6 {
	public static void main(String[] args) {
	/* 
		try {
			throw new Exception("예외 강제 발생");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	*/
		throw new RuntimeException("예외 강제 발생");
		// RuntimeException
		
	} 
}
