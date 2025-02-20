package ex2_set;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/*
TreeSet : 중복불가. 정렬됨

SortedSet의 구현 클래스
SortedSet은 Set의 하위 클래스 

Set : TreeSet은 모른다.
↑
SortedSet ← (subSet) 멤버

*/
public class SetEx3 {
	public static void main(String[] args) {
		SortedSet<String> set = new TreeSet<>();
//		Set<String> set = new TreeSet<>();
		String from = "bat";
		String to = "d";
		set.add("abc");set.add("alien");set.add("bat");set.add("azz");
		set.add("car");set.add("Car");set.add("disk");set.add("dance");
		set.add("dzzzz");set.add("dZZZZ");set.add("elev");set.add("fan");set.add("flower");
		System.out.println(set);
		System.out.println(set.subSet(from, to));
		System.out.println(set.subSet(from, to+"zzzz")); //to부분은 포함안됨
		//내림차순 정렬하기 : 
		set = new TreeSet<>(Comparator.reverseOrder());
		set.add("abc");set.add("alien");set.add("bat");set.add("azz");
		set.add("car");set.add("Car");set.add("disk");set.add("dance");
		set.add("dzzzz");set.add("dZZZZ");set.add("elev");set.add("fan");set.add("flower");
		System.out.println(set);
		//대소문자 구분없이 정렬되도록 객체 생성하기
//		set = new TreeSet<>(new Comparator<String>() {
//			@Override
//			public int compare(String s1, String s2) {
//				return s1.compareToIgnoreCase(s2);
//			}
//		});
		set = new TreeSet<>((s1,s2)->s1.compareToIgnoreCase(s2));
		set.add("abc");set.add("alien");set.add("bat");set.add("azz");
		set.add("car");set.add("Car");set.add("disk");set.add("dance");
		set.add("dzzzz");set.add("dZZZZ");set.add("elev");set.add("fan");set.add("flower");
		System.out.println(set);
	}
}
