package ex2_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/*
Set 인터페이스 : 중복 객체 저장 안함
boolean add(Object) : true : 추가 성공 / false : 추가 실패 

인덱스로 객체를 조회불가.

구현클래스
HashSet : 중복불가, 순서모름
TreeSet : 중복불가, 정렬됨 (Comparable) 없다면 설정
LinkedHashSet : 중복불가, 순서유지
*/
public class SetEx1 {
	public static void main(String[] args) {
		Object[] arr = {"홍길동", 1, "1", "김삿갓", "이몽룡", "홍길동", "성춘향", "향단이", "홍길동", "김삿갓"};
		Set<Object> set1 = new LinkedHashSet<>();
		Set<Object> set2 = new HashSet<>();
		Set<Object> set3 = new HashSet<>();
		
		for(int i = 0; i < arr.length; i++) {
			// set1 객체에 arr[i] 객체 추가 실패인 경우
			if(!set1.add(arr[i])) {
				if(!set2.add(arr[i])) {
					set3.add(arr[i]);
				}
			}
		}
		/*
		[성춘향, 1, 1, 김삿갓, 홍길동, 향단이, 이몽룡]
		[김삿갓, 홍길동]
		[홍길동]
		*/
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set3);
		
		// forEach 구문으로 조회가능
		for(Object o : set1) System.out.print(o + ",");
		System.out.println();
		for(Object o : set2) System.out.print(o + ",");
		System.out.println();
		for(Object o : set3) System.out.print(o + ",");
		System.out.println();		

	}
}
