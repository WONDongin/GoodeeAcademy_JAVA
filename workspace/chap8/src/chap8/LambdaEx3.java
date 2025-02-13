package chap8;
/*
매개변수와 리턴 값 모두 있는 경우
매개변수의 갯수가 한개인 경우 () 생략가능
{} 내부에 문장이 한개인 경우 {} return 생략가능 
*/
interface LambdaInterface3 {
	int method(int x, int y);
}
public class LambdaEx3 {
	public static void main(String[] args) {
		LambdaInterface3 f = (x, y)->{
			return x + y;
		};
		System.out.println("두수의 합:" + f.method(2, 5));
		f = (x,y) -> x+y;
		System.out.println("두수의 합:" + f.method(20, 5));
		f = (x,y) -> x/y;
		System.out.println("두수의 나눈 몫:" + f.method(20, 5));
		f = (x,y) -> x%y;
		System.out.println("두수의 나눈 나머지:" + f.method(20, 5));
		f = (x,y) -> (x > y) ? x : y;
		System.out.println("두수의 증 큰수:" + f.method(20, 5));
		f = (x,y) -> (x < y) ? x : y;
		System.out.println("두수의 증 작은수:" + f.method(20, 5));
	}
}
