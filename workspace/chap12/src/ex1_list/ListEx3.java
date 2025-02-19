package ex1_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/*
List 정렬하기
- Collections.sort(List<Comparable>)
- List 객체를 정렬하기 위해서는 요소 객체가 Comparable 인터페이스의 구현 객체

정렬관련 인터페이스
Comparable<T> 인터페이스는 Fuctional Interface임
- 클래스에 구현해서, 클래스의 기본 정렬방식 설정시 사용
- 추상메서드 : int compareTo(T t)
- 결과 : 음수: 현재객체 앞 / 양수: 현재객체 뒤

Comparator<T> 인터페이스는 Fuctional Interface임
- 정렬 실행시 동적으로 정령 방식을 설정할때 사용
- 추상메서드 : int compareTo(T t1, T t2)
- 결과 : 음수: 현재객체  t1 앞 / 양수: 현재객체 t1 뒤
*/
class Data implements Comparable<Data>{
	int value;
	Data(int value){
		this.value =  value;
	}
	@Override
	public String toString() {
		return value + "";
	}
	// 정렬방식
	@Override
	public int compareTo(Data d) {
		return value - d.value; //으름차순
		// return value - d.value;    //내림차순
	}
}

class Data2 implements Comparable<Data>{
	int value;
	Data2(int value){
		this.value =  value;
	}
	@Override
	public String toString() {
		return value + "";
	}
	@Override
	public int compareTo(Data d) {
		return value - d.value; //으름차순
		// return value - d.value;    //내림차순
	}
}
/*확인 */
public class ListEx3 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("a"); list.add("c");list.add("d");
		list.add("b"); list.add("f");
		// 기본
		System.out.println(list);
		// 정렬, 오름차순 정렬
		Collections.sort(list);
		System.out.println(list);
		// 역순, 내림차순 정렬
		Collections.sort(list,Comparator.reverseOrder());
		System.out.println(list);
		
		// Data 클래스 형식 (String → int)
		List<Data> list2 = new ArrayList<Data>();
		list2.add(new Data(1)); list2.add(new Data(3)); list2.add(new Data(5));
		list2.add(new Data(2)); list2.add(new Data(4));
		System.out.println(list2);
		
		Collections.sort(list2);
		System.out.println(list2);
		Collections.sort(list2,Comparator.reverseOrder());
		System.out.println(list2);
		
		List<Data2> list3 = new ArrayList<>();
		list3.add(new Data2(1)); list3.add(new Data2(3)); list3.add(new Data2(5));
		list3.add(new Data2(2)); list3.add(new Data2(4));
		System.out.println(list3);
		
		// 익명 객체 구현
		Collections.sort(list3, new Comparator<Data2>(){
			@Override
			public int compare(Data2 o1, Data2 o2) {
				return o1.value - o2.value;
			}
		});
		// 람다방식 - 오름차순
		// list3.sort(Comparator.comparingInt(n -> n.value));
		Collections.sort(list3,(d1, d2)-> d1.value - d2.value);
		System.out.println(list3);
		// 람다방식 - 내림차순
		Comparator<Data2> f =(d1, d2) -> d2.value - d1.value;
		Collections.sort(list3, f);
		System.out.println(list3);
	}
		
}
