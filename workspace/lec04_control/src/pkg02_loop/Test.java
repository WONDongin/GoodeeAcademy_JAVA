package pkg02_loop;

public class Test {
	public static void main(String[] args) {
		int[] numbers = {95,85,60,70,75,65,70,90,100,55};
		int sum = 0;
		int max = numbers[0];
		int maxIndex = 0;
		int min = numbers[0];
		int minIndex = 0;
		
		for(int i = 0; i < numbers.length; i++ ) {
			sum += numbers[i];
			
			if(max < numbers[i]) {
				max = numbers[i];
				maxIndex = i;
			}
			
			if(min > numbers[i]) {
				min = numbers[i];
				minIndex = i;
			}
		}
		
		double avg = (double) sum / numbers.length;
		
		System.out.println("합계: " + sum);
		System.out.println("평균: " + avg);
		System.out.println("최대: " + max);
		System.out.println("최대인덱스: " + maxIndex);
		System.out.println("최소: " + min);
		System.out.println("최소인덱스: " + minIndex);
	}

}
