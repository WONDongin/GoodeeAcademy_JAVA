package test;
/*
Test3의 Coin 클래스를 이용하기 
두개의 Coin 객체를 생성하기 myCoin, youCoin 객체 생성하기
앞면이 연속해서 3번 나오면 승리가 출력되도록 구동 클래스 구현하기   

[결과예시] => 결과는 다를 수 있습니다.
myCoin	youCoin
 앞면	뒷면
 뒷면	앞면
 앞면	앞면
 앞면	앞면
youCoin 승리
*/
public class Test06 {
	public static void main(String[] args) {
		Coin coin = new Coin();
		coin.name = "me";
		
		Coin coin2 = new Coin();
		coin2.name = "you";
		
		
		int count = 0;
		
		while(true) {
			coin.flip();
			
			if(coin.side == 0) {
				System.out.println("앞면");
				count++;
				if(count == 3) {
					System.out.println(coin.name + "승리");
					break;
				}
			} else {
				System.out.println("뒷면");
			}
		}
		
		
		
		
	}
}
