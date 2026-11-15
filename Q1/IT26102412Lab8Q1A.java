import java.util.Scanner;

public class IT26102412Lab8Q1A{
	public static void main (String[]args){
		
		// Declare an integer array with 5 elements
		int myArray[] = new int[5];
		
		// Create a Scanner object to get user input
		Scanner input = new Scanner(System.in);
		
		// Ask the user to enter 5 numbers with a for loop
		System.out.println("Enter 5 umbers:");
		for(int count = 0; count < myArray.length; count++){
			System.out.print("Enter Number " + (count + 1) + ": ");
			myArray[count] = input.nextInt();
		}
		
		// Display the array in reverse order with a for loop
		System.out.println("\nArray in Reverse Order:");
		for(int count = (myArray.length - 1); count >= 0; count--){
			System.out.print(myArray[count] + " ");
		}
	}
}