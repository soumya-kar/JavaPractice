package streamApi;

import java.util.ArrayList;
import java.util.List;

public class ConsumerInterfaceConcept {
	
	public static void main(String[] args) {
		//Takes single input argument and returns nothing
		List<String> prodList= new ArrayList<>();
		prodList.add("Shirt");
		prodList.add("Shoe");
		prodList.add("Soap");
		//forEach takes consumer object 
		prodList.forEach(x->System.out.println(x));
	}
}
