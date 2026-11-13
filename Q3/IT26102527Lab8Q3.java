import java.util.Scanner;
public class IT26102527Lab8Q3{
	
	public static void main(String [] args){
		// Create Scanner Object
		Scanner input = new Scanner(System.in);
		int number[] = new int[6];
		int count ;
	
		
		
		for (count = 0 ; count<=5;count++){
			
			do{
		
				System.out.print("Enter a positive number ("+ (count+1)+"/6): ");
				number[count] = input.nextInt();
				if (number[count]<= 0){
					System.out.println("Error: Enter only Positve Numbers");
				}
				
				
			}while(number[count]<= 0);
		}
		int max_num = number[0] ;
		
		for (count = 0; count<=5;count++){
			if (number[count]> max_num){
				max_num = number[count];
			}
			
		}
		
		System.out.println("\nArray contents:");
		for(count = 0 ;count<= 5;count++){
			System.out.print(number[count]+" ");
		}
		System.out.println();
		System.out.println("\nMaximum Number:" + max_num);
		
	}
}
		
				