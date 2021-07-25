package corejava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorExample {

	public static void main(String[] args) {
		List<Laptop> laps= new ArrayList<>();
		laps.add(new Laptop(4,  "Asus", 2000));
		laps.add(new Laptop(6, "Apple", 3000));
		laps.add(new Laptop(8, "Lenevo", 1000));
		
		Collections.sort(laps, (x1, x2) -> {
			return x1.getPrice()<x2.getPrice()? 1 :-1;
					
		});
		
		laps.forEach(System.out::println);
	}

}
