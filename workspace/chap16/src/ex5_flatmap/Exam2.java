package ex5_flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Exam2 {
	public static void main(String[] args) {
		Stream<String[]> strArrStrm = Stream.of(
				new String[] {"abc", "def", "jkl"},
				new String[] {"ABC", "DEF", "JKL"}
				);
		strArrStrm.flatMap(Arrays::stream).forEach(s -> System.out.println(s));
//		strArrStrm.flatMap(arr-> Arrays.stream(arr)).forEach(s -> System.out.println(s));
	}

}
