package ex5_flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;

/*
 * flatMaptoInt() : Stream을 IntStream 으로 변경.
 */
public class FlatMapEx2 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("10,20,30","40,50,60");
		Function<String, IntStream> f = data -> {
					String strArr[] = data.split(",");
					int intArr[] = new int[strArr.length];
					for(int i =0; i < strArr.length;i++) {
						intArr[i] = Integer.parseInt(strArr[i].trim());
					}
					return Arrays.stream(intArr);
				};
				IntStream isr =list.stream().flatMapToInt(f);
		
		//숫자들의 합과, 평균, 갯수 출력
		System.out.println("숫자들의 개수:" + list.stream().flatMapToInt(f).count());
		System.out.println("숫자들의 합:"+list.stream().flatMapToInt(f).sum());
		System.out.println("숫자들의 평균:"
							+list.stream().flatMapToInt(f).average().getAsDouble());
	}
	
}
