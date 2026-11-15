public class IT26102417Lab8Q2{

public static void main(String[]args){
    int[] A = {10,20,30,40,50};
    int[] B	= {34,67,12,89,12};
	int[] C = new int[5];
	  
	  // calculates A +B
    for(int i = 0 ; i < C.length; i++){
	    C[i] = A[i] + B[i];
    }

    System.out.println("A array contents ");
	
	for(int i = 0 ; i < A.length; i++){
		System.out.println( A[i] + " " );
	}
	
	System.out.println("\nB array contents ");
	
	for(int i = 0 ; i < B.length; i++){
		System.out.println( B[i] + " " );
	}
		
	System.out.println("\nArray contents (A + B):");
	
	for(int i = 0 ; i < C.length; i++){
		System.out.print( C[i] + " " );
	}	
			
   }			

}