package pkg01_wrapper_class;

public class MainClass {
	public static void main(String[] args) {
		
		// Wrapper class
		/*
		 	boolean - Boolean
		 	byte - Byte
		 	short - Short
		 	int - Integer
		 	long - Long
		 	float - Float
		 	double - Double
		 	char - Character
		 */
		
		// 값을 그냥 저장할 수 있다. (Auto Boxing)
		Integer a = 10;
		
		
		// 값을 그냥 꺼낼 수 있다. (Auto UnBoxing)
		int b = a + 10;
		
		System.out.println(a);
		System.out.println(b);
		
		// "문자열" -> 값
	
		int x =  Integer.parseInt("123");
		System.out.println(x);
		long y = Long.parseLong("1234567890");
		System.out.println(y);
		double z = Double.parseDouble("12.3");
		System.out.println(z);
		
	}
}
 