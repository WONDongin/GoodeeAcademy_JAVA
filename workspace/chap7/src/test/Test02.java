package test;
/*
2. Coin 클래스 구현하기
  Coin 클래스
   멤버변수 : int side (앞면:0, 뒷면:1), serialNo(동전번호), 
            sno(동전번호 생성을위한 클래스변수)
   생성자 : 구동 클래스에 맞도록 구현         
   멤버메서드 : void flip()
                Math.random() 메서드를 사용하여 side를 결정.

  [결과]
Coin 객체 생성 :1번 동전 : 앞면
flip() 실행 후 :1번 동전 : 뒷면
Coin 객체 생성 :2번 동전 : 뒷면
flip() 실행 후 :2번 동전 : 앞면
Coin 객체 생성 :3번 동전 : 뒷면
flip() 실행 후 :3번 동전 : 뒷면
Coin 객체 생성 :4번 동전 : 뒷면
flip() 실행 후 :4번 동전 : 앞면
Coin 객체 생성 :5번 동전 : 앞면
flip() 실행 후 :5번 동전 : 뒷면
Coin 객체 생성 :6번 동전 : 뒷면
flip() 실행 후 :6번 동전 : 앞면
Coin 객체 생성 :7번 동전 : 앞면
flip() 실행 후 :7번 동전 : 뒷면
Coin 객체 생성 :8번 동전 : 뒷면
flip() 실행 후 :8번 동전 : 뒷면
Coin 객체 생성 :9번 동전 : 뒷면
flip() 실행 후 :9번 동전 : 앞면
Coin 객체 생성 :10번 동전 : 뒷면
flip() 실행 후 :10번 동전 : 뒷면
생성 후 앞면 동전의 갯수 :3
생성 후 뒷면 동전의 갯수 :7
flip 후 앞면 동전의 갯수 :4
flip 후 뒷면 동전의 갯수 :6
 */
class Coin{
	int side, serialNo;
	static int sno;
	// 생성자
	Coin(int side){
		this.side = side;
        serialNo = sno++;
	}
	// flip() 메서드: 동전을 랜덤으로 뒤집음
    void flip() {
        side = (int) (Math.random() * 2);
    }
    
    // toString() 오버라이드: 동전 정보를 문자열로 반환
    @Override
    public String toString() {
        return serialNo + "번 동전 : " + (side == 0 ? "앞면" : "뒷면");
    }
    
}

public class Test02 {
	public static void main(String[] args) {
		Coin[] coinarr = new Coin[10];
		int[] cnt1 = new int[2];
		int[] cnt2 = new int[2];
		for(int i=0;i<coinarr.length;i++) {
			int side = (int)(Math.random() * 2);
			coinarr[i] = new Coin(side); 
			System.out.println("Coin 객체 생성 :" + coinarr[i]);
			cnt1[coinarr[i].side]++;
			coinarr[i].flip();
			System.out.println("flip() 실행 후 :" + coinarr[i]);
			cnt2[coinarr[i].side]++;
		}
		System.out.println("생성 후 앞면 동전의 갯수 :" + cnt1[0]);
		System.out.println("생성 후 뒷면 동전의 갯수 :" + cnt1[1]);	
		System.out.println("flip 후 앞면 동전의 갯수 :" + cnt2[0]);
		System.out.println("flip 후 뒷면 동전의 갯수 :" + cnt2[1]);	
	}
}
