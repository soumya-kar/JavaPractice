package streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorInterfaceConcept2 {

	static UnaryOperator<Integer> func1 = x -> x * 5;
	static UnaryOperator<Integer> func2 = x -> x ^ 5;  //It will do XOR operation
	static UnaryOperator<Integer> func3 = x -> x & 5;  //It will AND operation
	public static void main(String[] args) {

		System.out.println(func1.apply(6));  //30
		System.out.println(func2.apply(6));  //3 
		System.out.println(func2.apply(1)); //4
		System.out.println(func1.andThen(func2).apply(7)); //35^2 =38
	}
}
