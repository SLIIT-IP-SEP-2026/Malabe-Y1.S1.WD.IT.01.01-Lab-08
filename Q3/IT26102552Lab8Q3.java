import java.util.Scanner;
	public class IT26102552Lab8Q3{
		public static void main(String[] args){
			
			int array[] = new int[6];
			 Scanner input = new Scanner(System.in);
			 
			for(int i = 0 ; i < 6 ; i++){
				
				System.out.print("Enter a Positive Number( " + (i + 1) + "/6):");
				array[i] = input.nextInt();
				
			while (array[i] <= 0 ) {
				System.out.println("Error: Please Enter ONLY Positive Numbers");
				System.out.print("Enter a Positive Number( " + (i + 1) + "/6):");
				array[i] = input.nextInt();
				}
			}
			
			int max = array[0];
			
			for(int i = 1; i < 6 ; i++){
				if(array[i] > max){
					max = array[i];
				}			
			
				
			}
			System.out.println("\nArray contents :");
			 for(int j = 0; j < 6; j++) {
            System.out.print(array[j] + " " );
        }
		
			System.out.println("\nThe Maximum Number Entered: " + max);
			
		 }
	}
			
		
	