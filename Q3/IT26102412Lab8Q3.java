import java.util.Scanner;

public class IT26102412Lab8Q3{
	public static void main (String[]args){
		
		// Declare an array and initialize variables
		int number[] = new int[6];
		int maxNumber, value;
		int valueCount = 0;
		
		// Create a Scanner object to get user input
		Scanner input = new Scanner(System.in);
		
		// Get 6 positive numbers from the user using a while loop
		while(valueCount < number.length){
			System.out.print("Enter a positive number (" + (valueCount+1) +"/6): ");
			value = input.nextInt();
			if(value > 0){
				number[valueCount] = value;
				valueCount++;
			}else{
				System.out.println("Error: Please Enter ONLY Positive Numbers");
			}
		}
		
		// Display the contents of the array with a for loop
		System.out.println("\n");
		System.out.println("Array Content:");
		for(int numCount = 0; numCount < number.length; numCount++){
			System.out.print(number[numCount] + " ");
		}
		
		// Initialize maxNumber with the first element of the array
		maxNumber = number[0];
		
		// Find the maximum number in the array using a for loop
		for(int maxCount = 1; maxCount < number.length; maxCount++){
			if(maxNumber < number[maxCount]){
				maxNumber = number[maxCount];
			}
		}
		
		// Display the maximum number entered by the user
		System.out.print("\n");
		System.out.println("The Maximum Number Entered: " + maxNumber);
	}
}