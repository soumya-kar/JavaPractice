package programs;

public class PrintPyramid {
	
	/*
	 * 1
	 * 2 2
	 * 3 3 3
	 * 4 4 4 4
	 * 5 5 5 5 5
	 *
	 */
	
	public static void main(String[] args) {
		
		int rowCount=5;
		int rowNum=1;
		
		for(int i=0; i<rowCount;i++){
			
			for(int j=0; j<rowNum;j++){
				System.out.print(rowNum);
			}
			rowNum++;
			
			System.out.println();
			
		}
		
		
	}

}
