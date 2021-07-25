package streamApi;

import java.util.ArrayList;
import java.util.List;

public class UnaryOperatorInterfaceConcept {

	public static void main(String[] args) {
		/*
		 * Represents an operation on a single operand that produces a result of
		 * the same type as its operand. This is a specialization of Function
		 * for the case where the operand and result are of the same type.
		 * 
		 */
		//Example 1
		List<String> l = new ArrayList<>();
		l.add("Canada");
		l.add("US");
		l.add("Spain");
		
		l.replaceAll(ele -> ele + " Country");
		System.out.println(l);
	}
}
