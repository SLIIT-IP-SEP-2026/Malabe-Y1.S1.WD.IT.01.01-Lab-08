import java.util.Scanner;
public class IT26102407Lab8Q1A{
	
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		
		int myArray[] = new int[5];
		int i = 1 , j = 1;
		
		System.out.println("Enter 5 Numbers:");
		
		for(i=0; i<5; i++){
			
			j=i+1;
			System.out.print("Enter Number " + j + ": ");
			myArray[i] = input.nextInt();
			
		}
		
		System.out.println("");
		System.out.println("Array in Reverse Order:");
		
		for(i=4; i>=0; i--){
			
			System.out.print(myArray[i] + " ");
			
		}
		
		
	}
	
}