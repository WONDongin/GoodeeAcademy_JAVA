package ex3_map;

import java.util.Comparator;
import java.util.TreeMap;

public class Exam2 {
	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<>();
		mapPut(scores);
		System.out.println(scores);
		System.out.println("첫번째 key:" + scores.firstKey());
		System.out.println("마지막 key:" + scores.lastKey());
		System.out.println("가장 높은 점수를 받은 사람의 이름 출력하기: " + scores.lastEntry().getValue());
		System.out.println("94점보다 앞의 점수" + scores.lowerEntry(94));
		System.out.println("94점보다 뒤의 점수" + scores.higherEntry(94));
		
		System.out.println("94점을 포함한 앞의 점수" + scores.floorEntry(94));
		System.out.println("94점을 포함한 뒤의 점수" + scores.ceilingEntry(94));
		
		// 역순
		scores = new TreeMap<>(Comparator.reverseOrder());
		mapPut(scores);
		System.out.println(scores);
		System.out.println("가장 낮은 점수를 받은 사람의 이름 출력하기: " + scores.lastEntry().getValue());
		System.out.println("94점보다 앞의 점수" + scores.lowerEntry(94));
	}
	
	private  static void mapPut(TreeMap<Integer, String> scores) {
		scores.put(87, "홍길동");
		scores.put(98, "이몽룡");
		scores.put(75, "임꺽정");
		scores.put(94, "김삿갓");
		scores.put(80, "성춘향");
		scores.put(88, "향단이");
	}
}
