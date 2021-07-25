package java8Lamda;

public class lamdaDemo {

	public static void main(String[] args) {
		//The target type of this expression must be a functional interface
		A str= ()-> System.out.println("Hello India!");
		str.show();
	}

}
//SAM interface
@FunctionalInterface
 interface A {
	 public void show();

 }




