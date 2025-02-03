package chap2;
/*
	리터널에 사용되는 접미사
	L, l : long 형 리터널
	F, f : float 형 리터널
	D, d : double 형 리터널
 	
 */
public class VarEx4 {
	public static void main(String[] args) {
		long l1 = 100;
		float f1 = l1;
		l1 = (long) f1; // 명시적 형변환.
		l1 = 100L;
		// int i1 = 100L; int < long 형변환 (long)
		// f1 = 10.0D; 실수형 리터널의 기본 자료형은 double : 명시적 형변환 (float)
		// f1 = 10.0F; F : float 형 리터널을 의미
		
		System.out.println("f1=" + f1);
	}
}
