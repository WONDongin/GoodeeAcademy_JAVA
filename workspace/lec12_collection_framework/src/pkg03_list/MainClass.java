package pkg03_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
		
		// 초기화 이용한 ArrayList 생성 (수정 불가)
		List<String> sports = Arrays.asList("아구", "골프","볼링");
		
		// for 문을 이용한 ArrayList 순회
		for(int i = 0,  size =   sports.size(); i < size; i++) {
			System.out.println(sports.get(i));
		}
		
		// 평균, 중간 값 구하기
		List<Integer> numbers =  Arrays.asList(10, 20, 50, 60, 30, 70, 25, 55, 60);

		int avg = (int) numbers.stream().mapToInt(Integer::intValue).average().orElse(0);
		
		Collections.sort(numbers);
		int med = numbers.get(numbers.size() / 2);
		
		System.out.println(avg);
		System.out.println(med);
		
	}
}
