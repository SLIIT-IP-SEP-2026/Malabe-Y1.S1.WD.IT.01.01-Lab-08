

public class IT26102590Lab8Q2 {

	public static void main (String[]args){
	
	
		
		 int A[]= { 10, 20, 30, 40, 50};
		 int B[]= {34, 67, 12, 89, 12};
		 int C[]= new int [5];
	
	 //storing values in array A
	System.out.println("\n");
	System.out.println("A Array Contents: " );
	for (int countA=0; countA< 5; countA++)
	{	
	
		System.out.print(A[countA] +" ");
		
	}
	
	//storing values in array B
	System.out.println("\n");
	System.out.println ("B Array Contents: " );
	for (int countB=0; countB< 5; countB++){
		
	System.out.print(B[countB] +" ");}
		
	
	
	System.out.println("\n");
	System.out.println("C Array Contents (A+B): ");
	
	//storing values in array C
	
	for(int countC=0; countC<5; countC++)
			{
			C[countC] = A[countC]+ B[countC];
			System.out.print(C[countC] +" ");
			
			}
			
			System.out.println("\n");
	 
	}
	
}
	
	
