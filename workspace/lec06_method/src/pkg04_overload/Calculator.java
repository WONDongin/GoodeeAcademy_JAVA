package pkg04_overload;

public class Calculator {
	public void add(int... numbers) {
		int total = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			total += numbers[i];
		}
		
		 System.out.println(total);
	}
	
	public void add(double... numbers) {
		double total = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			total += numbers[i];
		}
		
		 System.out.println(total);
	} 
}
