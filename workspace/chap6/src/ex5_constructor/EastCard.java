package ex5_constructor;

public class EastCard {
	int number;
	boolean inKwang;
	
	EastCard(int num, boolean k){
		this.number = num;
		this.inKwang  = k;
	}
	
	EastCard(){
		this.number = 1;
		this.inKwang  = true;
	}
	
	public String toString() {
		return "" + number + (inKwang ? "K" : "");
	}
	
}
