package ex3_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/*
Map 인터페이스 : (key,객체) 쌍인 객체들의 모임, 컬랙션 프레임워크의 하위 x
- put(key, value) : map 에 데이터 추가, 키값이 존재하는 경우는 value 수정
- get(key) : value 값을 리턴

- Set keySet() : map 객체 중 key 목록 조회.
- Collection values() : map 객체 중 value 목록 조회
- Set<Map.Entry> entrySet() : Map.Entry 객체로 조회
	Map.Entry 객체 : 키,객체(value) 쌓인 객체 1개
		key : getkey(), value:getValue();
- value remove(key) : key에 해당하는 객체 제거, value 값 리턴
  
*/
public class MapEx1 {
	public static void main(String[] args) {
		// 키 + 객체 : 엔트리(Map.Entry), entrySet() - set타입;
		String[] names = {"홍길동", "김삿갓", "이몽룡", "임꺽정", "김삿갓"};
		int[] nums = {1234, 4567, 2350, 9870, 3456};
		
		// Map (키 , 객체) - 키 중복시 객체값만 변경됨 + 섞임/중복x 
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(int i = 0; i<names.length; i++) {
			map.put(names[i], nums[i]);
		}
		// {김삿갓=3456, 홍길동=1234, 이몽룡=2350, 임꺽정=9870}
		System.out.println(map);
		
		// map.get("홍길동") : 단일 키값 출력
		System.out.println(map.get("홍길동")); // 1234
		
		// map.size(): Map 의 사이즈
		System.out.println("map 객체의 요소의 크기 : " + map.size());
		
		// map.keySet(): key 값들만 조회, key 들을 [Set] 객체로 리턴
		Set<String> keyset = map.keySet();
		for(String k : keyset) {
			System.out.println(k + ":" + map.get(k));
		}
		
		// map.values() : 값들만 조회, [Collection] 객체로 리턴
		Collection<Integer> values = map.values();
		for(Integer i : values) {
			System.out.println(i);
		}
		
		// map.entrySet() : (key,객체) 쌍인 객체 조화. [Set] 객체로 리턴
		Set<Map.Entry<String, Integer>> entry = map.entrySet();
		for(Map.Entry<String, Integer> m : entry) {
			System.out.println(m.getKey() + ":" + m.getValue());
		}

		// map.remove(key) : key에 해당하는 객체 제거, value 값 리턴
		Integer tel = map.remove("홍길동");
		System.out.println("제거된 홍길동의 전화번호: " + tel);
		System.out.println("map 객체의 요소 갯수: " + map.size());
		System.out.println(map);
	}
}
