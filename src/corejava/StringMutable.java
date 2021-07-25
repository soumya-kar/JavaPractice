package corejava;

public class StringMutable {
	
	public static void main(String[] args){
		StringBuffer sbf= new StringBuffer("Soumya");
		sbf.append(" Kar");
		System.out.println(sbf); //Soumya Kar
		sbf.replace(0, 6, "Mimo");
		System.out.println(sbf); //Mimo Kar
		sbf.delete(5, 6);
		System.out.println(sbf); //Mimo ar
	}

}
