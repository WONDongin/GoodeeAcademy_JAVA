package ex2_supplier;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

/*
Supplier 관련 인터페이스
T getXXX() : 매개변수 없고, 리턴값 존재
Supplier<T> : T get()
IntSupplier : int getAsInt()
DoubleSupplier : double getAsDouble()
BooleanSupplier : boolean getAsBoolean() 
*/
public class SupplierEx1 {
	public static void main(String[] args) {
		Supplier<String> s1 = () -> {
			return "java";
		};
		System.out.println(s1.get()); // java
		
		IntSupplier s2 = () -> (int) (Math.random() * 6) + 1; // 1 ~ 6 사이의 임의의 수 리턴
		System.out.println(s2.getAsInt());
		
		double[] arr = {1, 1.2, 2.4, 5.3, 10, 3};
		DoubleSupplier s3 = () -> { // arr 배열의 합 리턴
			double sum = 0;
			for(double d : arr) {
				sum += d;
			}
			return sum;
		};
		System.out.println(s3.getAsDouble());
	}
}
