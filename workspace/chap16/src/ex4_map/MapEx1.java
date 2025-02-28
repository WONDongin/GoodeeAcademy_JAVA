package ex4_map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * map : 스트림의 요소를 다른요소로 변경 할 수 있는 함수
 * 		 mapXXXX
 * mapToInt : IntStream 형 <- Stream 형 함수
 * 
 * 메서드 종류
 * Stream<R> map(Function<T,R>) : T형을 입력받아 R값을 리턴하여 R형 Stream을 생성
 * Stream<R> mapToObj(DoubleFunction<T>) : double형을 입력받아 R값을 리턴하여 R형 Stream을 생성
 * Stream<R> mapToObj(IntFunction<T>) : int형을 입력받아 R값을 리턴하여 R형 Stream을 생성
 * Stream<R> mapToObj(LongFunction<T>) : long형을 입력받아 R값을 리턴하여 R형 Stream을 생성
 * 
 * IntStream mapToInt(ToIntFunction<T>) : T형을 입력받아 int형 리턴 IntStream 생성
 * IntStream mapToInt(IntUnaryOperator<T>) : int 형을 입력받아 int형 리턴 IntStream 생성
 * LongStream mapToLong(ToLongFunction<T>) : T형을 입력받아 long형 리턴 LongIntStream 생성
 * DoubleIntStream mapToDouble(ToDoubleFunction<T>) : T형을 입력받아 double형 리턴 DoubleIntStream 생성
 */
public class MapEx1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동전","김삿갓","구운몽","전우치전","사씨남정기");
		System.out.println();
		//글자의 크기로 새로운 IntStream을 생성하기
		//Stream<String> list.stream()
//		IntStream isr = list.stream().mapToInt(String::length);
		IntStream isr = list.stream().mapToInt(s->s.length());
		isr.forEach(System.out::println);
		//Stream은 일회성이라 한바퀴 돌면 더이상 사용할 수 없다.
		System.out.println("전체 문자열 크기"+list.stream().mapToInt(s->s.length()).sum());
		System.out.println("전체 문자열 개수"+list.stream().count());
		//1 ~100까지의 합을 출력하기
		System.out.println("1~100까지의 합:"+IntStream.rangeClosed(1, 100).sum());
		
		//list를 이름으로 가진 학생 객체를 출력하기
		Stream<Student> sts = list.stream().map(s -> new Student(s, 0, 0));
		sts.forEach(System.out::println);	
	}

}
