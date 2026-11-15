import java.util.Scanner;

public class IT26102412Lab8Q1B{
	public static void main (String[]args){
		
		// Initialize evenCount and declare two integer arrays
		int evenCount = 0;
		int myArray[] = new int[5];
		int evenArray[] = new int[5];
		
		// Create a Scanner object to get user input
		Scanner input = new Scanner(System.in);
		
		// Ask the user to enter 5 numbers with a for loop
		System.out.println("Enter 5 umbers:");
		for(int count = 0; count < myArray.length; count++){
			System.out.print("Enter Number " + (count + 1) + ": ");
			myArray[count] = input.nextInt();
		}
		
		// Display the contents of myArray with a for loop
		System.out.println("\nmyArray Contents:");
		for(int count = 0; count < myArray.length; count++){
			System.out.print(myArray[count] + " ");
		}
		
		// Check for even numbers and store them in evenArray
		for(int count = 0; count < myArray.length; count++){
			if(myArray[count] % 2 == 0){
				evenArray[evenCount] = myArray[count];
				evenCount++;
			}
		}
		
		// Display the contents of evenArray with a for loop
		System.out.println("\nevenArray Contents:");
		for(int count = 0; count < myArray.length; count++){
			System.out.print(evenArray[count] + " ");
		}
	}
}