package pkg03_list;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
	public static void main(String[] args) {
		
		// List<E> 타입 선언, ArrayList<E> 객체 생성
		List<String> seasons = new ArrayList<String>();
		
		// 요소 추가
		seasons.add("봄");
		seasons.add("여름");
		seasons.add("가울");
		seasons.add("겨울");
		
		// 요소 찾기
		if(seasons.contains("겨울")) {
			System.out.println("겨울이 있다.");
		}
		
		// 요소 삭제
		seasons.remove(0);
		seasons.remove(0);
		
		// 공백 검사
		if(seasons.isEmpty()) {
			System.out.println("비어 있다.");
		} else {
			System.out.println("비어 있지 않다.");
		}
		
		// 요소 가져오기
		System.out.println(seasons.get(0));
		System.out.println(seasons.get(1));
		
		// 길이 확인
		System.out.println(seasons.size());
	}
}
