package ex2_supplier;

import java.util.function.BooleanSupplier;
//BooleanSupplier를 이용하여 data배열의 합이 짝수인지 여부를 출력하기
public class Exam1 {
	public static void main(String[] args) {
		int[] data = {1,2,5,78,4,6,8,12,1};
		BooleanSupplier s = ()->{
			int sum=0;
			for(int i : data) sum += i;
			return sum%2==0;
		};
		if(s.getAsBoolean())
			System.out.println("data 배열의 합은 짝수 입니다.");
		else
			System.out.println("data 배열의 합은 홀수 입니다.");
	}

}