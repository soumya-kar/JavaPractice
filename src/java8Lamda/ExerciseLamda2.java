package java8Lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExerciseLamda2 {
	
	public static void main(String[] args) {
		List<Employee> employees= Arrays.asList(
				new Employee(675, "Nack", "Smith", "Developer"),
				new Employee(341, "Paul", "Smith", "QA"),
				new Employee(876, "Rahul", "Smith", "Singer"),
				new Employee(100, "Jonas", "Smith", "Analyst"),
				new Employee(210, "Mike", "Smith", "Artist")
			) ;
		
		for(Employee e: employees)
			System.out.println(e);
		
		System.out.println("----------------------------------");
		//Sort it by id
		/*Collections.sort(employees, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getEmpId() >o2.getEmpId() ? 1:-1;
			}
		});
		
		for(Employee e: employees)
			System.out.println(e);*/
		
		//Using java 8
		System.out.println("----------------------------------");
		Collections.sort(employees, (o1, o2)->o1.getEmpId() >o2.getEmpId() ? 1:-1);
		
		for(Employee e: employees)
			System.out.println(e);
	
		System.out.println("----------------------------------");
		//Sort it by first name
		
		Collections.sort(employees, (o1,o2)-> o1.getfName().compareTo(o2.getfName()));
		for(Employee e: employees)
			System.out.println(e);
	}
	
	
}
