package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class BiConsumerInterfaceCocept {

	public static void main(String[] args) {
		List<Instructor> instructors = Arrays.asList(
				new Instructor("Subhash", 12, "Developer", "M", true, Arrays.asList("Java 8", "Appium", "Docker")),
				new Instructor("Mike", 6, "QA", "M", false, Arrays.asList("Selenium", "Core Java", "Soap UI")),
				new Instructor("Martha", 9, "SDET", "F", true, Arrays.asList("Selenium", "TestNG", "Cucumber")),
				new Instructor("Paul", 12, "Tester", "M", true, Arrays.asList("Cucumber", "Selenium", "Docker")),
				new Instructor("Ami", 4, "Full Stack QA", "F", false, Arrays.asList("Appium", "Protractor", "Rest assured"))
		);
		
		//print the name and gender of instructors
		BiConsumer<String, String> func= (n, g) -> System.out.println("Name: "+n+"  Gender: "+g);
		instructors.forEach(instructor -> func.accept(instructor.getName(), instructor.getGender()));
		System.out.println("------------------");
		//print name and list of courses
		BiConsumer<String, List<String>> func2= (n, c) -> System.out.println("Name: "+n+"  Courses: "+c);
		instructors.forEach(instructor -> func2.accept(instructor.getName(), instructor.getCourses()));
		System.out.println("------------------");
		//print the name and gender of instructors who teaches online
		instructors.forEach(instructor ->{
				if(instructor.isHaveOnlineCourses())
					func.accept(instructor.getName(), instructor.getGender());		
		});

	}
}
