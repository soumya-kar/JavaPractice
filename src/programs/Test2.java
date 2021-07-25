package programs;

import java.util.Arrays;

public class Test2 {
	
	public static void main(String[] args) {
		int [] A ={1, 2, 4, 0, 0, 7, 5};
		System.out.println(abc(A));
		
	}

	
	public static boolean abc(int [] A){
		
		int[] intArray = new int[3];
		int[] secArray= new int[]{0,0,7};
		int j=0;
			for(int i=0; i<A.length; i++){
				if(A[i]==0 || A[i]==7){
					intArray[j]=A[i];
					j++;
				}
				
			}
			
		if(Arrays.equals(intArray, secArray))
			return true;
		else
			return false;
		
	}
}
