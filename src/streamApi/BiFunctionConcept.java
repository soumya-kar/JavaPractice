package streamApi;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionConcept {
	/*
	 * BiFunction interface takes two argument and return a value
	 * whereas Function interface takes one argument and return a value
	 */
	
	/**
     * Applies this function to the given arguments.
     *
     * @param t the first function argument
     * @param u the second function argument
     * @return the function result
     R apply(T t, U u);
     */
	
	static BiFunction<Integer, Integer, Integer> addFunc= (a,b)->a+b;
	static BiFunction<Integer, Integer, Integer> multiFunc= (a,b)->a*b;
	static Function<Integer, Integer> multiFun2 =  n-> n*2;
	public static void main(String[] args) {
		int a=5, b=10;
		System.out.println("Addition of "+a+" and "+b+" is "+ addFunc.apply(a, b));  //15
		System.out.println("Multiplication of "+a+" and "+b+" is "+ multiFunc.apply(a, b));  //50
		System.out.println(addFunc.andThen(multiFun2).apply(a, b));  //30
	}

}
