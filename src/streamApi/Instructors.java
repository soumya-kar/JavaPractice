package streamApi;

import java.util.Arrays;
import java.util.List;

public class Instructors {
	
	public static void main(String[] args) {
		
		List<Instructor> instructors = Arrays.asList(
				new Instructor("Subhash", 12, "Developer", "M", true, Arrays.asList("Java 8", "Appium", "Docker")),
				new Instructor("Mike", 6, "QA", "M", false, Arrays.asList("Selenium", "Core Java", "Soap UI")),
				new Instructor("Martha", 9, "SDET", "F", true, Arrays.asList("Selenium", "TestNG", "Cucumber")),
				new Instructor("Paul", 12, "Tester", "M", true, Arrays.asList("Cucumber", "Selenium", "Docker")),
				new Instructor("Ami", 4, "Full Stack QA", "F", false, Arrays.asList("Appium", "Protractor", "Rest assured"))
		);
		
		//print all values from all instructors
		instructors.forEach(c1 -> System.out.println(c1));
		System.out.println("-------------------------");	
		//print the name of all the instructors who teaches online
		instructors.forEach(c1-> {
			if(c1.isHaveOnlineCourses())
				System.out.println(c1.getName());		
		});
		System.out.println("-------------------------");	
		//print the name of all the instructors who teaches Selenium
		instructors.forEach(c1 -> c1.getCourses().forEach(c2 -> {
			if(c2.equals("Selenium"))
				System.out.println(c1.getName());
		}
		));
		System.out.println("-------------------------");	
		//print the name of all the instructors who teaches Cucumber and who are female
		instructors.forEach(c1 -> c1.getCourses().forEach(c2 -> {
			if(c2.equals("Cucumber") && c1.getGender().equals("F"))
				System.out.println(c1.getName());
		}
		));
	
		
	
	
	
	}
}
