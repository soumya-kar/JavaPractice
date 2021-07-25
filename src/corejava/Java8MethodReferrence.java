package corejava;

import java.util.Arrays;
import java.util.List;

public class Java8MethodReferrence {
	
	//Java 8  
	//Call by method
	//Lamda Expression
	public static void main(String[] args) {
		List<String> names= Arrays.asList("Rahul", "Manoj","Priya","Arman", "Soumya","Lila");
		names.forEach(i-> System.out.println(i)); //using lamda expression
		System.out.println("-------------");
		names.forEach(System.out::println); //Using method referrence
		System.out.println("-------------");
		names.forEach(Java8MethodReferrence::getText);  //using method referrence , for static methods
		System.out.println("-------------");
		names.forEach(i->getText(i)); //Using lamda expression
		System.out.println("-------------");
		Java8MethodReferrence mr=new Java8MethodReferrence();
		names.forEach(mr::getLenth);
		System.out.println("-------------");
		names.forEach(i-> mr.getLenth(i)); //Using lamda expression
		
		
		
	}
	
	public static void getText(String str){
		System.out.println( str.toUpperCase());
	}
	
	public void getLenth(String str){
		System.out.println(str+" "+str.length());
	}
	

}
