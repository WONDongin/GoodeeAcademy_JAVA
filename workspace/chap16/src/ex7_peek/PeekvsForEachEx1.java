package ex7_peek;

import java.util.Arrays;
/*
 * peek : 중간 처리 반복자
 * 		  중간 단계에서 추가 작업시 사용됨.
 * 		  다음 단계 처리가 없으면 동작이 실행되지 않는다.
 * foreach : 최종 단계 반복자
 */
public class PeekvsForEachEx1 {
	public static void main(String[] args) {
		int intArr[] = {1,2,3,4,5};
		System.out.println("peek 메서드 연습");
		int tot = 
		Arrays.stream(intArr).filter(a ->a%2==0)
		.peek(n ->System.out.print(n+",")).sum();
		System.out.println("="+tot);
		System.out.println("ForEach 메서드 연습");
		Arrays.stream(intArr).filter(a->a%2==0)
		.forEach(n -> System.out.print(n+","));
	}

}
