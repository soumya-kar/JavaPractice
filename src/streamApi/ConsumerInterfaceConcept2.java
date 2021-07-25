package streamApi;

import java.util.function.Consumer;

public class ConsumerInterfaceConcept2 {
	
	static Consumer<String> func1= s -> System.out.println(s.length()+" is the length of "+s);
	
	public static void main(String[] args) {
		
		func1.accept("Hamsafar");
	}
}
