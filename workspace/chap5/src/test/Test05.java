package test;
/*
(1)+(1+2)+(1+2+3)+(1+2+3+4)+(1+2+3+4+5)+(1+2+3+4+5+6)+
 (1+2+3+4+5+6+7)+(1+2+3+4+5+6+7+8)+(1+2+3+4+5+6+7+8+9)+
(1+2+3+4+5+6+7+8+9+10)=220 한줄로 출력하기
*/
public class Test05 {
	public static void main(String[] args) {
		int sum = 0;
		// StringBuilder : String 객체끼리 더하는 방법
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i <= 10; i++) {
			sb.append("(");
			for(int j = 1; j <= i; j++) {
				sb.append(j);
				if(j < i) {sb.append("+");}
			}
			sb.append(")");			
			sum += i * (i + 1) / 2;
			
			if(i < 10) {
				sb.append("+");
			} else {
				sb.append("=").append(sum);
			}
		}
		
		System.out.println(sb);
	}
}
