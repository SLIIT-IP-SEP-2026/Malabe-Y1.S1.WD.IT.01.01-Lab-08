public class IT26102623Lab8Q2
{
	public static void main(String[] args)
	{
		
		//Initialize Arrays with Expected values
		
		int A[] = {10,20,30,40,50} ;
		int B[] = {34,67,12,89,12} ;
		
		// Initialize Array With Added Values
		int C[] = new int[5] ;		
		int count ;
		
		//Print A Array Contents
		System.out.println("A Array Contents: ");
		for (count=0; count < A.length; count++)
		{
			System.out.print(A[count] + " ");
		}
		
		System.out.println();
		
		//Print B Array Contents
		System.out.println("\nB Array Contents: ");
		for (count=0; count < B.length; count++)
		{	
			System.out.print(B[count] +  " ");	
		}
		System.out.println();
		
		//Calculate and Print C Array (A+B) Contents
		System.out.println("\nC Array Contents (A + B): ");
		for (count=0; count < C.length; count++)
		{
			C[count] = A[count] + B[count];
			System.out.print(C[count]+  " ");
			
		}
	}
}