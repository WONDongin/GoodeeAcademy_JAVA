package pkg02_loop;

public class MainClass {
	 public static void main(String[] args) {
		
		// 1. 일반 for 문
		String[] animals = {"기린", "호랑이", "코뿔소"};
		System.out.println(animals.length);
		for(int i = 0; i < animals.length; i++) {
			System.out.println(animals[i]); 
		}
		
		
		// 2. 향상 for 문
		int[] numbers = {10, 20, 30};
		for(int n : numbers) {
			System.out.println(n);
		}
	}	
}
