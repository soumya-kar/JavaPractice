package streamApi;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class BinaryOperatorInterfaceConcept {
	/*
	 * Represents an operation upon two operands of the same type, producing a
	 * result of the same type as the operands. This is a specialization of
	 * BiFunction for the case where the operands and the result are all of the
	 * same type.
	 */
	static BinaryOperator<Integer> func = (x1, x2) -> x1 + x2;
	static Function<Integer, Integer> func2 = x1 -> x1 * 10;
	static Function<Integer, Integer> func3 = x1 -> x1 ^ 2; //It will do XOR operation

	public static void main(String[] args) {

		System.out.println(func.apply(10, 20));  //30
		System.out.println(func.andThen(func2).apply(10, 20));   //300
		System.out.println(func3.apply(10)); //8
	}
}
