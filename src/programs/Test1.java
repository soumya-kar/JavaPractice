package programs;

import java.util.Arrays;
import java.util.List;

public class Test1 {
	
	public static void main(String[] args) {
		/*int[] A={1, 3, 5};
		int smallestPos=1;
		for (int i=0; i<A.length; i++){
			if(A[i]>1 && (A[i]!=smallestPos+1)){
				smallestPos=smallestPos+1;
			}
		}
		
		System.out.println(smallestPos);*/
		
		int A[] = { 0, 10, 2, -10, -20 };
        System.out.println(solution(A));
	}
	
	static int solution(int[] A)
    {
        int n = A.length;
        boolean[] present = new boolean[n + 1];

        for (int i = 0; i < n; i++) {

            if (A[i] > 0 && A[i] <= n)
                present[A[i]] = true;
        }

        for (int i = 1; i <= n; i++)
            if (!present[i])
                return i;

        return n + 1;
    }

}
