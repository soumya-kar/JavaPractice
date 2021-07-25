package corejava;

public class InnerClassLamda {
	
	public static void main(String[] args) {
		B obj= ()->System.out.println("Hello");
		obj.show();
	}

}

@FunctionalInterface
interface B{
	
	public void show();
	
}