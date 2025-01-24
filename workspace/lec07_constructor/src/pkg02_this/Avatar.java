package pkg02_this;

public class Avatar {
	// this : 메소드를 호출한 객체를 의미한다.
	/* 활용 방법 : 
		1) 필드와 매개변수를 구분하는 용도
		2) 메소드 체이닝를 구현하는 용도
	*/
	
	// this 확인
	public void method() {
		System.out.println(this);
	}
	
	//field
	String name;
	int level;
	
	// name 를 저장하는 메소드
	public void setName(String name) {
		this.name = name;
	}
	
	// level 를 올리는 메소드
	public Avatar levelUp() {
		level++;
		return this;
	}
}
