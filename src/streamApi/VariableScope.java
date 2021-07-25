package streamApi;

import java.util.function.Function;
import java.util.function.IntConsumer;

public class VariableScope {

	public static void main(String[] args) {
		int b = 2;
		IntConsumer func = (a) -> System.out.println(a);

		Function<Integer, Integer> func2 = (a) -> {
			a = a * 10;
			return b * a;
		};

		System.out.println(func2.apply(5));
	}
}
