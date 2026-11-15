public class IT26102407Lab8Q2{
	
	public static void main(String[]args){
		
		int[]A = {10,20,30,40,50};
		int[]B = {34,67,12,89,12};
		int C[] = new int[5]; 
		int i=0;
		
		System.out.println("A Array Contents: ");
		
		for(i=0; i<5; i++){
			
			System.out.print(A[i] + " ");
			
		}
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("B Array Contents: ");
		
		for(i=0; i<5; i++){
			
			System.out.print(B[i] + " ");
			
		}
		
		for(i=0; i<5; i++){
			
			C[i] = A[i] + B[i];
			
		}
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("C Array Contents (A+B): ");
		
		for(i=0; i<5; i++){
			
			System.out.print(C[i] + " ");
			
		}
		
	}
	
}