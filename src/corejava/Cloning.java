package corejava;

public class Cloning {
	
	public static void main(String[] args) {
		/*
		 * Shallow
		 * Deep
		 * Clone
		 */
		Abc obj= new Abc();
		obj.i=6;
		obj.j=9;
		
		Abc obj1= (Abc)obj.clone();
		System.out.println(obj);
		obj1.i=7;
		System.out.println(obj1);
		
	}

}

class Abc implements Cloneable{
	int i;
	int j;
	@Override
	public String toString() {
		return "Abc [i=" + i + ", j=" + j + "]";
	}
	
	public Object clone(){
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
		
	}
}
