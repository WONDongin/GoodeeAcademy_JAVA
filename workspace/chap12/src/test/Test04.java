package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
 * 1 ~ 99까지의 정수를 입력받아서 TreeSet에 저장하고, 0 을 입력하면 입력을 종료한다. 
 * 입력된 값을 정렬하여 출력하기.
   1 ~ 99 까지의 숫자가 아닌 경우 TreeSet에서 저장하지 말것.
 * 
 * set1 오름차순 정렬되도록 출력.
 * set2 내림차순 정렬되도록 출력하기.
 * 
 *[결과]
1부터 99까지의 숫자를 입력하세요 (종료 : 0)
1 2 5 9 1 100 12 3 2 5 64 123 4 5 0
set1:[1, 2, 3, 4, 5, 9, 12, 64]
set2:[64, 12, 9, 5, 4, 3, 2, 1]
 */

public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> set1 = new TreeSet<>(); // 오름차순 정렬
		
		System.out.println("1부터 99까지의 숫자를 입력하세요 (종료 : 0)");
		
		while (true) {
			int num = sc.nextInt();
			
			if(num == 0) {System.out.println("시스템 종료"); break;}
			
			if(num >= 1 && num <= 99) {
				set1.add(num);
			}
		}
		sc.close();
		// 오름차순
		System.out.println("set1: " + set1);
		// 내림차순
		Set<Integer> set2 = new TreeSet<Integer>((a, b) -> b - a);
		set2.addAll(set1);
		System.out.println("set2: " + set2);
		
		// List
		List<Integer> set3 = new ArrayList<Integer>(set1);
		set3.sort(Collections.reverseOrder());
		// Collections.sort(set3, Collections.reverseOrder());
		// set3.sort(Comparator.comparingInt(a -> -a));
		System.out.println("list3: " + set3);
	}
}
