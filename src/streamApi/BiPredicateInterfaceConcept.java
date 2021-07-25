package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class BiPredicateInterfaceConcept {
	
	public static void main(String[] args) {
		List<Instructor> instructors = Arrays.asList(
				new Instructor("Subhash", 12, "Developer", "M", false, Arrays.asList("Java 8", "Appium", "Docker")),
				new Instructor("Mike", 6, "QA", "M", false, Arrays.asList("Selenium", "Core Java", "Soap UI")),
				new Instructor("Martha", 9, "SDET", "F", true, Arrays.asList("Selenium", "TestNG", "Cucumber")),
				new Instructor("Paul", 12, "Tester", "M", true, Arrays.asList("Cucumber", "Selenium", "Docker")),
				new Instructor("Ami", 4, "Full Stack QA", "F", false, Arrays.asList("Appium", "Protractor", "Rest assured"))
		);
		
		//all instructor who teach online and have more than 7 years of experience
		
		BiPredicate<Boolean, Integer> func= (a, b) -> a==true && b>7;
		instructors.forEach(instructor-> {
			if(func.test(instructor.isHaveOnlineCourses(), instructor.getExperience()))
				System.out.println(instructor.getName());
			
		});	
	}
}
