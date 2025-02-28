package ex4_operator;

import java.util.function.IntBinaryOperator;

/*
Operator 인터페이스
- Function 인터페이스의 하위 인터페이스
- 매개변수, 리턴값 모두 존재.
- T applyXXXX(T) 

- 종류
	UnaryOperator<T>  : T apply(T) Function  => 인터페이스의 하위 인터페이스
	BinaryOperator<T> : T apply(T,T) => BiFunction 인터페이스의 하위 인터페이스
	
	DoubleUnaryOperator  : double applyAsDouble(double) => 한개의 double 객체를 연산하여 double 값을 리턴
	DoubleBinaryOperator : double applyAsDouble(double, double) => 두개의 double 값를 연산하여 double 값을 리턴
	
	IntUnaryOperator :  int applyAsInt(int) => 한개의 int 값를 연산하여 int 값을 리턴
	IntBinaryOperator : int applyAsInt(int, int) => 두개의 int 값를 연산하여 int 값을 리턴
	
	LongInaryOperator : Long applyAsLong(long) => 한개의 long 값를 연산하여 long 값을 리턴
	LongBinaryOperator : long applyAsLong(long, long) => 두개의 long 값를 연산하여 long 값을 리턴
*/
public class OperatorEx1 {
	private static int[] score = {92,95,87};
	public static void main(String[] args) {
		int max = score[0], min = score[0];
		
		for(int i = 0; i < score.length; i++) {
			if(max < score[i]) score[i] = max;			
			if(min > score[i]) min = score[i];
		}
		System.out.println("최댓값:" + max);
		System.out.println("최소값:" + min);
		
		// 람다식
		System.out.print("최댓값:" + maxOrMin((a,b)-> (a>b)?a:b));
		System.out.print("최소값:" + maxOrMin((a,b)-> (a<b)?a:b));
		
	}
	private static int maxOrMin(IntBinaryOperator op) {
		int result = score[0];
		for(int s : score) result = op.applyAsInt(result, s);
		return result;
	}
}
