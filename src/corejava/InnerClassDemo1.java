package corejava;

public class InnerClassDemo1 {
	//Member inner class
	public static void main(String[] args) {
		A.B obj= new A().new B();
		//obj.a=30;
		//obj.show();
		obj.show();
	}

}

class A{
	
	int a;
	String name;
	
	class B{
		public void show(){
			System.out.println("In B");
		}
	}
	
	
	
}