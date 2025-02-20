package ex3_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/*
1. 대한민국 : 서울, 캐나다: 오타와, 영국: 런던 저장하는 HashMap 객체 생성하기
2. 화면에서 나라 이름을 입력받아서 수도를 출력. 등록된 나라가 아니면 수도가 등록되지 않았습니다.
   종료가 입력될때 까지 계속 입력받기
3. 프로그램이 종료전에 등록된 내용 조회하기
   등록된 나라들 조회하기
   등록된 수도들 조회하기
   등록된 나라:수도들 조회하기
4. 등록된 나라가 아닌 경우 수도를 입력받아 map 객체에 추가하기

*/
public class Exam1 {
	public static void main(String[] args) {
		//1. 
		Map<String,String> map = new HashMap<>();
		map.put("대한민국", "서울");
		map.put("캐나다", "오타와");
		map.put("영국", "런던");
		System.out.println(map);
		//2
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("나라이름을 입력하세요(종료:종료)");
			String nat = scan.next();
			
			if(nat.equals("종료")) break;
			String cap = map.get(nat);
			
			if(cap == null) {
				System.out.println(nat + "나라의 수도는 등록되지 않았습니다.");
				System.out.println("수도를 등록하시겠습니까(Y)?");
				String yn = scan.next();
				if(yn.equalsIgnoreCase("Y")) {
					System.out.println(nat + "의 수도를 입력하세요");
					cap = scan.next();
					map.put(nat, cap);
				} else continue;
			} else {
				System.out.println(nat + "의 수도 : " + cap);
			}
		}
		//3
		System.out.print("등록된 나라들 : ");
		for(String k : map.keySet()) System.out.print(k + ",");
		System.out.println();
		System.out.print("등록된 수도들 : ");
		for(String v : map.values()) System.out.print(v + ",");
		System.out.println();
		System.out.print("등록된 나라=수도:");
		for(Map.Entry<String,String> m : map.entrySet()) System.out.print(m + ",");
		System.out.println();
		System.out.print("등록된 나라=수도:");
		for(String k : map.keySet()) System.out.print(k + "="+map.get(k) + ",");
		System.out.println();
	}
}
