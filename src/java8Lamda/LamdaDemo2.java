package java8Lamda;

public class LamdaDemo2 {
	
	public static void main(String[] args) {
		
		B obj= new B(){
				
				public void show() {
					
					System.out.println("Hello USA!");
					
				}
		};
		obj.show();
	}
	

}

interface B {
	
	public void show();
	
}

