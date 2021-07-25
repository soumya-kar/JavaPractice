package streamApi;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class BinaryOperatorInterfaceConcept2 {
	//We will see use of minBy and maxBy methods of BinaryOperator
	static BinaryOperator<Integer> func = (x1, x2) -> x1 + x2;
	static Comparator<Integer> func2= (a, b) -> a.compareTo(b);
	
	public static void main(String[] args) {
		System.out.println("Max of 10 and 30: "+BinaryOperator.maxBy(func2).apply(10, 30)); //30
		System.out.println("Min of 10 and 30: "+BinaryOperator.minBy(func2).apply(10, 30)); //10
	}
}
