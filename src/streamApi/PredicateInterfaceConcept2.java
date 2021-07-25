package streamApi;

import java.util.function.Predicate;

public class PredicateInterfaceConcept2 {
	
	public static void main(String[] args) {
		
		//check if number greater than 10 and returns true or false
		Predicate<Integer> func= x -> x>10;
		System.out.println(func.test(35)); //true
		System.out.println(func.test(9));  //false
		
		//check if the number is greater than 10 AND even number
		Predicate<Integer> func2= x-> x%2==0;
		System.out.println(func.and(func2).test(20)); //true
		
		//check if the number is greater than 10 OR even number
		System.out.println(func.or(func2).test(19)); //true
		
		//check if number is greater than 10 AND is not even (x%2 !=0)
		System.out.println(func.and(func2.negate()).test(1453)); //true
		
	}

}
