package test;
/*
command line에서 숫자로 이루어진 문자를 두개 받아서 두수의 공약수를 구하시오
int num1 = Integer.parseInt(args[0])
  [결과]
  10과 20 의 공약수 : 1,2,5,10,

*/
public class Test14 {
	public static void main(String[] args) {
		
		int num0 = Integer.parseInt(args[0]);
		int num1 = Integer.parseInt(args[1]);
		System.out.println(num1 + "" + num0);
		
		StringBuffer stringBuffer = new StringBuffer(num0);
	
		
		for(int i =1; i <= num0; i++) {
			if(num0 % i == 0) {
				System.out.print(i + ",");
			}
		}
		
		System.out.println();
		
		for(int i =1; i <= num1; i++) {
			if(num1 % i == 0) {
				System.out.print(i + ",");
			}
		}
	}
}
