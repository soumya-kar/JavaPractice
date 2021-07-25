package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Java8StreamApi {
	
	public static void main(String[] args) {
		//map()
		List<Integer> numbers= Arrays.asList(2,4,6,8,5);
		List<Integer> squares= numbers.stream().map(x->x*x).collect(Collectors.toList());
		System.out.println(squares);
		
		//filter
		List<String> names= Arrays.asList("Canada", "Columbia", "India", "England");
		List<String> filteredList=names.stream().filter(s->s.startsWith("C")).collect(Collectors.toList());
		System.out.println(filteredList);
		
		//sort
		List<Integer> numbers2= Arrays.asList(2,4,6,8,5);
		List<Integer> sortedList=numbers2.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		
		//Set
		List<Integer> numbers3= Arrays.asList(2,4,6,8,5);
		Set<Integer> squares2= numbers3.stream().map(x->x*x).collect(Collectors.toSet());
		System.out.println(squares);
		
		//forEach
		List<Integer> numbers4= Arrays.asList(2,4,6,8,5);
		numbers4.stream().map(x->x*x).forEach(i->System.out.println(i));
		
		//reduce
		List<Integer> numbers5= Arrays.asList(2,4,6,8,5, 14,17,18);
		int even =numbers5.stream().filter(i->i%2==0).reduce(0,(ans, i)->ans+i);
		System.out.println(even);
	}
	
	

}
