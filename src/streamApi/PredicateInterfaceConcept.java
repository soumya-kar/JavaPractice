package streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateInterfaceConcept {
	
	public static void main(String[] args) {
		
		//It returns boolean and takes one argument
		
		Predicate<Integer> func= x -> x>5;
		
		List<Integer> list= Arrays.asList(1, 2, 3, 5, 8, 9, 10);
		List<Integer> colLIst=list.stream().filter(func).collect(Collectors.toList());
		System.out.println(colLIst);
		
		List<String> prodList= new ArrayList<>();
		prodList.add("Shirt");
		prodList.add("Shoe");
		prodList.add("Soap");
		
		List<String> result=prodList.stream().filter(x -> x.equals("Shirt")).collect(Collectors.toList());
		System.out.println(result);
		
		
	}

}
