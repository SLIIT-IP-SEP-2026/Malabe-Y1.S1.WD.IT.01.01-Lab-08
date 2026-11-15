import java.util.Scanner;

public class IT26101227Lab8Q3{
	
	public static void main(String[] args){
		
		int numberArray [] = new int[6];
		int numberCount = 0;
		int userInput;
		
		// Create a Scanner object for input
		Scanner input = new Scanner(System.in);
		
		// Capture 10 Positive Numbers into the Array
		while (numberCount < 6){
			System.out.print("Enter a Positive Number (" + (numberCount + 1) + "/6): ");
			userInput = input.nextInt();
			
			if (userInput > 0){
				numberArray[numberCount] = userInput; // Store the Positive Number
				numberCount++;
			}else{
				System.out.println("Error: Please Enter ONLY Positive Numbers"); // Display Error
			}
		}
		 
		// Find the Maximum Number in the Array
		int maxNmber = numberArray[0];
		
		for (int count = 0; count < numberArray.length; count++){
			if (numberArray[count] > maxNmber){
				maxNmber = numberArray[count];
			}
		}
		
		// Print NUmber Array 
		System.out.println("\nArray Contents:");
		for (int count = 0; count < numberArray.length; count++){
			System.out.print(numberArray[count] + " ");
		}
		System.out.println();
		
		// Display the maximum Number
		System.out.println("The Maximum Number Entered: " + maxNmber);
	}
}