package corejava;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.print.attribute.standard.PrinterLocation;

public class Java8Lamda 
{
	
	public static void main(String[] args) {
		
		
		//Method-1
		List<Integer> values= Arrays.asList(1,2,3,4,5,6);
		/*
		Iterator<Integer> i= values.iterator();
		
		while(i.hasNext()){
			System.out.println(i.next());
		}*/
		//Method-2
		/*for(int i : values ){
			System.out.println(i);
		}*/
		
		//Internal Iteration
		//Method-3
		values.forEach(i -> System.out.println(i));
		
		
		
		
	}
	

	
	
	
}
