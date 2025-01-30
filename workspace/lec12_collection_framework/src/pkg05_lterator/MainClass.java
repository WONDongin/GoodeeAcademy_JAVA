package pkg05_lterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainClass {
	public static void main(String[] args) {
		
		// HashSet <E> 객체 생성
		Set<String> set = new HashSet<String>();
		
		// 요소 추가
		set.add("국어");
		set.add("영어");
		set.add("수학");
		set.add("과학");
		set.add("역사");
		
		// Iterator<E> 객체 생성
		Iterator<String> itr = set.iterator();
		
		// hasNext() :  요소가 있으면 true 반환
		// next() : 요소를 가져오기
		while (itr.hasNext()) {
			String subject = (String) itr.next();
			System.out.println(subject);
			
		}
	}
}
