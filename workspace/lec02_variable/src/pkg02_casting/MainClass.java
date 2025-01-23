package pkg02_casting;

public class MainClass {
	public static void main(String[] args) {
		// 1.자동 형 변환(promotion)
		// byte -> short -> int -> long -> float -> double
		byte a = 127;
		short b = a;
		int c = b;
		long d = c;
		float e = d;
		double f = e;
		System.out.println(f);
		
		// 2. 강제 형 변환(casting)
		int x = 256;
		byte y = (byte) x;
		System.out.println(y);
		
	}
}
