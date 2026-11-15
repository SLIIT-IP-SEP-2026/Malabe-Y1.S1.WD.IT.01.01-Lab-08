public class IT26102626Lab8Q2{
	public static void main(String[]args){
		
		//Creating an array called A with predefined values
		int A[] = {10,20,30,40,50};
		
		//Creating an array called B with predefined values
		int B[] = {34,67,12,89,12};
		
		//Creating an Aarray called C to store calculated values
		int C[] = new int[5];
		int count = 0;
		
		//Calculate A + B to be stored in the C array
		for(count = 0;count<A.length;count++){
			C[count] = A[count] + B[count];
		}
		
		//Display Array elements of A
		System.out.println();
		System.out.println();
		System.out.println("A Array Contents: ");
		for(count=0;count<A.length;count++){
			System.out.print(A[count] + " ");
		}
		
		//Display Array elements of B
		System.out.println();
		System.out.println();
		System.out.println("B Array Contents: ");
		for(count=0;count<B.length;count++){
			System.out.print(B[count] + " ");
		}
		
		//Display Array elements of C
		System.out.println();
		System.out.println();
		System.out.println("C Array Contents (A + B) : ");
		for(count=0;count<C.length;count++){
			System.out.print(C[count] + " ");
		}
	}
}
