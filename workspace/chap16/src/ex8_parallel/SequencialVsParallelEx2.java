package ex8_parallel;

import java.util.Arrays;
import java.util.List;

public class SequencialVsParallelEx2 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
		long start = System.nanoTime(); //현재까지의 시간을 나노초 리턴
		long end = System.nanoTime();
		System.out.println("순차처리 시간: "+ (end-start));
		System.out.println();
		start = System.nanoTime();
		//parallelStream :병렬로 데이터를 처리하는 스트림
		list.parallelStream().filter(a->
		a%2 ==0).forEach((a) -> System.out.println(Thread.currentThread()+":"+a));
		end = System.nanoTime();
		System.out.println("병렬처리 시간: "+(end-start));

	}

}
