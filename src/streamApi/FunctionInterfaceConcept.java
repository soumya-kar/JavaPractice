package streamApi;

import java.util.function.Function;

public class FunctionInterfaceConcept {
	/*
	 * Interface Function<T,R> Type Parameters: T - the type of the input to
	 * the function R - the type of the result of the function. This is a
	 * functional interface and can therefore be used as the assignment
	 * target for a lambda expression or method reference.
	 */
	/*
	 * Applies this function to the given argument.
	 * @param t the function argument
	 * @return the function result
	 * R apply(T t);
	 */
	static Function<String, Integer> func = x -> x.length();
	static Function<String, String> func1 = x -> x.toUpperCase();
	static Function<Integer, String> func3 = x -> x%2==0 ? "Even Number": "Odd Number";
	static Function<Integer, Integer> func2 = x -> x * 2;
	static Function<Integer, Boolean> func4= x -> x>10;
	static Function<Double,Integer> func5= x -> x.intValue()*23;
	
	public static void main(String[] args) {
		
		//Represents a function that accepts one argument and produces a result. 
		System.out.println("Length "+func.apply("This is java 8"));  //Length 14
		System.out.println("To uppercase "+func1.apply("London"));  //To uppercase LONDON
		System.out.println("Odd or Even "+func3.apply(67)); //Odd or Even Odd Number
		System.out.println("Is greater than 10 :"+func4.apply(65));  //Is greater than 10 :true
		System.out.println("20X: "+func5.apply(5.36566)); //20X: 115
		
		//Chaining of function using andThen method of Function interface
		//First 'func' will apply and then with the result 'func2' will be called
		System.out.println(func.andThen(func2).apply("Soumya Kar")); //20
		System.out.println("Lenth is even or odd: "+func.andThen(func3).apply("Indian")); //Lenth is even or odd: Even Number
		System.out.println(func.andThen(func3).andThen(func1).apply("Indian"));
		
		//Chaining of function using  compose method 
		//Argument in compose method(func3) will be evaluated first and then 'func' will be evaluated 
		System.out.println(func.compose(func3).apply(98));
		
	}

}
