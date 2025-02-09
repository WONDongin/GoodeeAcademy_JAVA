package test;
/*
3. 동전을 표현하는 Coin 클래스 구현하기
      멤버변수 :  동전의 면(side)
      멤버메서드 : flip()  - 0, 1
           기능 : 동전을 던져 동전의 면을 변경한다. Math.random() 메서드 이용. 
                 앞면,뒷면 출력함. 
*/
class Coin{
	
	public int  side;
	
	public int  flip() {
		side = (int) (Math.random() * 2);
		return side;
	}
	
	// 현재 동전 면을 문자열로 반환하는 메서드
    public String getSideString() {
        return side == 0 ? "앞면" : "뒷면";
    }
	
}
public class Test03 {
	public static void main(String[] args) {
		Coin coin = new Coin();
		System.out.println(coin.side==0?"앞면":"뒷면");
		coin.flip();
		System.out.println(coin.side==0?"앞면":"뒷면");
		
	}
}
