import java.util.Scanner;
	public class  IT26102552Lab8Q2{
		public static void main(String[] args){
			
			int A[] = {10, 20, 30, 40, 50};
			int B[] = {34, 67, 12, 89, 12};
			int C[] = new int[5];
			Scanner input = new Scanner(System.in);
			
			for(int i=0 ; i < 5; i++){
			C[i] = A[i] + B[i];
			}
			
			System.out.println("\n A array contents:");
			for(int i = 0; i < 5 ; i++){
				System.out.print(A[i] + " ");
			}
			
			System.out.println("\n\n B array contents:");
			for(int i = 0; i < 5 ; i++ ){
				System.out.print(B[i] + " ");
			}
			
			System.out.println("\n\n C array contents(A + B):");
			for(int i = 0; i < 5 ; i++ ){
				System.out.print(C[i] + " ");
			}
			
		}
	}