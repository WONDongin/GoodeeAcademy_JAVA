package ex3_map;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/*
TreeMap : key 값을 기준으로 정렬됨
 
*/
public class MapEx3 {
	public static void main(String[] args) {
		TreeMap<String,Book> books = new TreeMap<String, Book>();
		books.put("홍길동전", new Book("홍길동전", "허균", 10000));
		books.put("춘향전", new Book("춘향전", "미상", 15000));
		books.put("구운몽", new Book("구운몽", "김만중", 5000));
		System.out.println(books);
		
		System.out.println("첫번쨰 key:" + books.firstKey()); // 구운몽
		System.out.println("첫번쨰 entry:" + books.firstEntry()); // 구운몽=(구운몽,김만중,5000)
		System.out.println("마지막 key:" + books.lastKey()); // 홍길동전
		System.out.println("마지막 entry:" + books.lastEntry());// 홍길동전=(홍길동전,허균,10000)
		// lowerEntry("춘향전") : 춘향전보다 앞쪽 객체
		System.out.println("춘향전 앞의 Book" + books.lowerEntry("춘향전"));
		// higherEntry("춘향전") : 춘향전보다 뒤쪽 객체
		System.out.println("춘향전 뒤의 Book" + books.higherEntry("춘향전"));
		// floorEntry("춘향") : 춘향부터 앞쪽 객체
		System.out.println("춘향부터 앞의 Book" + books.floorEntry("춘향"));
		// ceilingEntry("춘향") : 춘향부터 뒤쪽 객체
		System.out.println("춘향부터 뒤의 Book" + books.ceilingEntry("춘향"));
	}
}
