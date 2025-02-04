package chap4;
/*
 	임의의 수(난수)를 생성하여 상품 선택하기
 */
public class SwitchEx02 {
	public static void main(String[] args) {
		// 1 ~ 10사이의 임의의 수
		int num = (int)(Math.random() * 10) +1;
		/*
		 	0.0 <= Math.random() < 1.0
		 	0 <= Math.random() * 10 < 10.0
		 	0 <= (int) (Math.random() * 10) <= 9
		 	1 <= (int) (Math.random() * 10) + 1 <= 10
		 */
		switch (num) {
		case 1:  System.out.println("자전거 당첨"); break;
		case 2: System.out.println("USE 당첨"); break;
		case 3: System.out.println("마우스 당첨"); break;
		default: System.out.println("다음 기회에 : " + num);
			
		}
	}
}
