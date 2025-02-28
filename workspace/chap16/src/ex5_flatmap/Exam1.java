package ex5_flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;

public class Exam1 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				"This is a Java book",
				"Lambda Expressions",
				"Java8 supports lambda Expressions");
		list.stream().flatMap(data -> Arrays.stream(data.split(" ")))
		.forEach(word -> System.out.println(word));

	}

}
