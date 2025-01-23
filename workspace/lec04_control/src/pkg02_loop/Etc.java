package pkg02_loop;

public class Etc {
	public static void main(String[] args) {
		
		//반복문 종료 : break
		int a = 1;
		while (true) {
			if(a > 5) {
				break;
			}
			
			System.out.print(a);
			a++;
		}
		
		//반복문 시작시점으로 돌아가기 : continue
		int b = 0;
		while (b < 10) {
			b++;
			
			if(b % 2 == 0) {
				continue;
			}
			
			System.out.print(b);
		}
	}
}
