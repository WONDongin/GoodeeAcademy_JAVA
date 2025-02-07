package test;
/*다음의 결과나 나오도록 Card 클래스를 구현하기

[결과]
Heart:1(100,250)
Spade:1(100,250)
Heart:1(50,80)
Spade:1(50,80)
*/
class Card{
	static int width = 100;
	static int height = 250;
	String kind;
	int number;
	
	public String toString() {
		return kind + ":" + number + "(" + width + ", " + height + ")";
	}
}
public class Test01 {
	public static void main(String[] args) {
		 Card card1 = new Card();
		 card1.kind = "Heart";
		 card1.number = 1;
	     System.out.println(card1);
	     
		 Card card2 = new Card();
		 card2.kind = "Spade";
		 card2.number = 1;
	     System.out.println(card2);
	     
	     Card.width = 50;
	     Card.height = 80;
	     System.out.println(card1);
	     System.out.println(card2);		
	}
}
