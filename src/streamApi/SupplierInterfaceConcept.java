package streamApi;

import java.util.function.Supplier;

public class SupplierInterfaceConcept {
	
	/**
     * Gets a result.
     *
     * @return a result
     */
    //T get();
	
	public static void main(String[] args) {
		
		Supplier<Integer> func= () -> (int)(Math.random()*1000);
		System.out.println(func.get());
		System.out.println(func.get());
		
	}
}
