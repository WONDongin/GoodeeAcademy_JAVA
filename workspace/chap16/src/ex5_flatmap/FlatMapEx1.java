package ex5_flatmap;

import java.util.Arrays;
import java.util.List;
/*
 * flatMap 함수 : 다른 형태의 요소를 새로운 스트림으로 생성
 * 
 * Stream<R> flatMap(Function<T, Stream<R>>) : T를 매개변수로 입력받아 R형 Stream으로 리턴
 * DoubleStream flatMap(DoubleFunction<DoubleStream>) : 
 * 									   double형을 매개변수 입력받아 DoubleStream으로 리턴
 * IntStream flatMap(IntFunction<IntStream>) : int형을 매개변수로 입력받아 IntStream으로 리턴
 * IntStream flatMapToInt(Function<T, IntStream>) :
 * 									   T를 매개변수로 입력받아 IntStream으로 리턴
 */
public class FlatMapEx1 {
	public static void main(String[] args) {
		List<String> list1 =Arrays.asList("자바 8 버전에 ","추가된 스트림을", "열심히 공부하자" );
		list1.stream() //3개의 문자열 요소를 Stream<String> 생성
		//data.split(" ") : data 값을 공백을 기준으로 문자열 배열로 리턴. String[] 형
		//Arrays.stream(data.split(" ")) : 문자열 배열을 Stream<String>으로 리턴
		//Stream<String> 요소가 3개=> Stream<String> 요소가 7개인 변환
		.flatMap(data -> Arrays.stream(data.split(" ")))
		.forEach(word -> System.out.println(word));
	}

}
