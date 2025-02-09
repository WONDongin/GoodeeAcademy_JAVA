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
		 	Coin myCoin = new Coin();
	        Coin youCoin = new Coin();

	        int myCount = 0, youCount = 0; // 연속 앞면 횟수 저장

	        System.out.println("myCoin\tyouCoin");

	        while (true) {
	            myCoin.flip();
	            youCoin.flip();

	            System.out.println(" " + myCoin.getSideString() + "\t" + youCoin.getSideString());

	            // myCoin이 앞면이면 카운트 증가, 아니면 초기화
	            myCount = (myCoin.side == 0) ? myCount + 1 : 0;
	            // youCoin이 앞면이면 카운트 증가, 아니면 초기화
	            youCount = (youCoin.side == 0) ? youCount + 1 : 0;

	            // 3번 연속 앞면이 나오면 종료
	            if (myCount == 3) {
	                System.out.println("myCoin 승리!");
	                break;
	            } else if (youCount == 3) {
	                System.out.println("youCoin 승리!");
	                break;
	            }
	        }
	}
}
