package pkg06_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MainClass {
	public static void main(String[] args) {
		
		
		// Map<K, V> 인터페이스로 타입 선언
		Map<String, Integer> map;
		
		// HashMap<K, V> 클래스 객체 생성	
		map = new HashMap<String, Integer>();
		
		// Entry(Key 와 Value 의 조합) 추가
		map.put("국어", 100);
		map.put("영어", 98);
		map.put("수학", 99);
		map.put("국어", 99);
		
		// 확인
		System.out.println(map);
		
		
		// Value 확인
		System.out.println(map.get("국어"));
		
		// 순회1, key 를 기준으로 순회하기
		Set<String> set = map.keySet();
		for(String subject : set) {
			System.out.println(subject + ":" + map.get(subject));
		}
				
		// 순회2, Entry  단위로 순회하기
		for(Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
}
