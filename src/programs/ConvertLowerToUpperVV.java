package programs;

public class ConvertLowerToUpperVV {
	
	public static void main(String[] args) {
		String s="Facemask";
		
		StringBuffer newStr= new StringBuffer(s);
		for(int i=0; i<s.length();i++){
			if(Character.isLowerCase(s.charAt(i))){
				newStr.setCharAt(i, Character.toUpperCase(s.charAt(i)));
			}
			else  {
				newStr.setCharAt(i, Character.toLowerCase(s.charAt(i)));
			}
		
	}
		System.out.println("String after case conversion : " + newStr);    
	}
}


