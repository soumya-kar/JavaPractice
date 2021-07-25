package programs;

public class FibonaciNo {
	
	public static void main(String[] args) {
		
		//0 1 1 2 3 5 8 13 21 34
		int n1=0, n2=1,n3;
		System.out.println(0);
		System.out.println(1);
		for(int i=2;i<10; i++){
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			
			
		}
	}

}
