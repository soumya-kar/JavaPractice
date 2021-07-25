package java8Lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExerciseLamda1 {
	
	public static void main(String[] args) {
		
		List<Integer> nums= Arrays.asList(323, 656, 690, 562, 234, 805);
		
		//Print the sorted list
		Collections.sort(nums);
		System.out.println("Sorted list: "+nums);
		
		//Print the sorted list in descending order
		//Java 7 -Using Anonymous class
		Collections.sort(nums, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return (int)o1 >(int)o2 ? -1:1;
			}
		});
		System.out.println("Sorted list in reverse order using anonymous class "+nums);
		
		//Java 8 -Using Lamda Expression
		Collections.sort(nums, (o1, o2) -> (int)o1 >(int)o2 ? -1:1);
		System.out.println("Sorted list in reverse order using lamda "+nums);
		
		
		//Sort the list based on the last digit
		Collections.sort(nums, (o1, o2) -> ((int)o1)%10 >((int)o2)%10 ? 1:-1);
		System.out.println("Sorted list based on last digit "+nums);
	}
}
