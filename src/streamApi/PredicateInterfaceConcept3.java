package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateInterfaceConcept3 {
	
	public static void main(String[] args) {
		List<Instructor> instructors = Arrays.asList(
				new Instructor("Subhash", 12, "Developer", "M", false, Arrays.asList("Java 8", "Appium", "Docker")),
				new Instructor("Mike", 6, "QA", "M", false, Arrays.asList("Selenium", "Core Java", "Soap UI")),
				new Instructor("Martha", 9, "SDET", "F", true, Arrays.asList("Selenium", "TestNG", "Cucumber")),
				new Instructor("Paul", 12, "Tester", "M", true, Arrays.asList("Cucumber", "Selenium", "Docker")),
				new Instructor("Ami", 4, "Full Stack QA", "F", false, Arrays.asList("Appium", "Protractor", "Rest assured"))
		);
		
		//all instructor who teach online
		Predicate<Instructor> func= p1 -> p1.isHaveOnlineCourses();
		instructors.forEach(instructor->{
				if(func.test(instructor))
					System.out.println(instructor.getName());
		});
		System.out.println("---------------------------");
		//all instructors who have more than 10 years of experience
		Predicate<Instructor> func2= p1->p1.getExperience()>10;
		instructors.forEach(instructor->{
			if(func2.test(instructor))
				System.out.println(instructor.getName());
	});
		
		System.out.println("---------------------------");
	
		//all instructor who teach online and have more than 10 years of experience
		instructors.forEach(instructor -> {
			if(func.and(func2).test(instructor))
				System.out.println(instructor.getName());	
		});	
	}
}
