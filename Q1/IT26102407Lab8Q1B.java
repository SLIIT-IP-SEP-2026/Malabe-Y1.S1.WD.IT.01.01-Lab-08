import java.util.Scanner;
public class IT26102407Lab8Q1B{
	
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		
		int myArray[] = new int[5];
		int evenArray[] = new int[5];
		int i = 0 , j = 0, Q = 0;
		
		System.out.println("Enter 5 Numbers:");
		
		for(i=0; i<5; i++){
			
			j=i+1;
			System.out.print("Enter Number " + j + ": ");
			myArray[i] = input.nextInt();
			
			if(myArray[i] % 2 == 0){
				
				evenArray[Q] = myArray[i];
				Q++;
				
			}
			
		}
		
		System.out.println("");
		System.out.println("Array in Reverse Order:");
		
		for(i=0; i<5; i++){
			
			System.out.print(myArray[i] + " ");
			
		}
		
		System.out.println(" ");
		System.out.println("evenArray Contents: ");
		
		for(i=0; i<5; i++ ){
			
			System.out.print(evenArray[i] + " ");
			
		}
		
		
	}
	
}