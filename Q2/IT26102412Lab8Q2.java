public class IT26102412Lab8Q2{
	public static void main (String[]args){
		
		// Declare and initialize two arrays and declare a third array
		int A[] = {10, 20, 30, 40, 50};
		int B[] = {34, 67, 12, 89, 12};
		int C[] = new int[5];
		
		// Display the contents of A array with a for loop
		System.out.println("\nA Array Cotents:");
		for(int count = 0; count < A.length; count++){
			System.out.print(A[count] + " ");
		}
		
		// Display the contents of B array with a for loop
		System.out.println("\nB Array Cotents:");
		for(int count = 0; count < B.length; count++){
			System.out.print(B[count] + " ");
		}
		
		// Add the corresponding elements of A and B and store them in C
		System.out.println("\nC Array Cotents (A + B):");
		for(int count = 0; count < C.length; count++){
			C[count] = A[count] + B[count];
			System.out.print(C[count] + " ");
		}
	}
}