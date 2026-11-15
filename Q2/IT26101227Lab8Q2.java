public class IT26101227Lab8Q2{
	
	public static void main(String[] args){
		
		// Initialize arrays A and B 
    	int A[] = {10, 20, 30, 40, 50};
		int B[] = {34, 67, 12, 89, 12};
		
		// Declare array C to store the result
		int C[] = new int[5];
		
		// Add each element of A and B and store it in C
		for (int count = 0; count < A.length; count++){
			C[count] = A[count] + B[count]; 
		}
		
		// Print Array A 
		System.out.println("\nA Array Contents:");
		for (int count = 0; count < A.length; count++){
			System.out.print(A[count] + " ");
		}
		
		System.out.println();
	
	    // Print Array B
		System.out.println("\nB Array Contents:");
		for (int count = 0; count < B.length; count++){
			System.out.print(B[count] + " ");
		}    
		
		System.out.println();
		
		// Print Array C
		System.out.println("\nB Array Contents (A + B):");
		for (int count = 0; count < C.length; count++){
			System.out.print(C[count] + " ");
		}    
	}
}