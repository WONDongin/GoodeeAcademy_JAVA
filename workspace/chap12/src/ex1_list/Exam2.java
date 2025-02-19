package ex1_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
Name 클래스 구현하기
기본 정렬방식은 한글이름으로 설정하기
멤버변수 : kor, eng
생성자 : 구동클래스에 맞도록 설정
멤버메서드 : toString 메서드를 구현하기
[결과]
김:kim, 이:lee
... 
*/
class Name implements Comparable<Name>{
	String kor;
	String eng;
	
	Name(String kor, String eng) {
		this.kor = kor;
		this.eng = eng;
	}

	@Override
	public String toString() {
		return kor + ":" + eng;
	}
	@Override
	public int compareTo(Name n) {
		return kor.compareTo(n.kor); //으름차순
	}
}

public class Exam2 {
	public static void main(String[] args) {
		List<Name> list = new ArrayList<>(Arrays.asList(
				new Name("김", "kim"),
				new Name("이", "lee"),
				new Name("박", "park"),
				new Name("안", "an"),
				new Name("최", "choi")
		));
		System.out.println("기존:");
		System.out.println(list); 
		
		// compareTo() 실행
		Collections.sort(list); 
		System.out.println("국문 순:");
		System.out.println(list);
		
		System.out.println("영문 순:");
		list.sort(Comparator.comparing(n -> n.eng));
		System.out.println(list);
		
		System.out.println("국문 내림차순:");
		// Comparator.reverseOrder() : 오름차순 → 내림차순 
		Collections.sort(list,Comparator.reverseOrder()); 
		System.out.println(list);
		
		System.out.println("영문 내림차순:");
		// Collections.sort(list,(n1, n2)-> n2.eng.compareTo(n1.eng));
		list.sort((n1, n2) -> n2.eng.compareTo(n1.eng));
		System.out.println(list);
		
	}
}
