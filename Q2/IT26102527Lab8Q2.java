public class IT26102527Lab8Q2{
	public static void main(String[] args){
		
		//Arrays with Assigned values
	 
		int A[] = {10,20,30,40,50};
		int B[] = {34,67,12,89,12};
		//Array with unknown values
		int C[] = new int[5];
		int count;
		
		for (count=0;count < A.length;count++){
			C[count] =A[count]+B[count];
		}
	
		
		//Print A array contents
		System.out.println("\nA Array Contents:");
		for (count = 0; count< A.length;count++){
			System.out.print(A[count] + " ");
		}
		
		System.out.println();
		//Print B array contents
		System.out.println("\nB Array Contents:");
		for (count = 0; count < B.length;count++){
			System.out.print(B[count] + " ");
		}
		
		System.out.println("");
		//Print C array contents
		System.out.println("\nC Array Contents(A + B):");
		for (count = 0; count < C.length;count++){
			System.out.print(C[count] + " ");
		}
		
		
		
	}
}
	