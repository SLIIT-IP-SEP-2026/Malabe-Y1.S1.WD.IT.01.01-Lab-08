import java.util.Scanner;

public class IT26101227Lab8Q1B{
	
	public static void main(String[] args){
		
		// Create a Scanner object for input
		Scanner input = new Scanner(System.in);
	    
		// Declare 'myArray' and 'evenArray' of size 5 for integers 
		int myArray [] = new int[5];
		int evenArray [] = new int[5];
		
		int evenCount = 0;   // Count for even Numbers 
		
		System.out.println("Enter 5 Numbers: ");
		
		// Capture 5 Numbers from user  
		for (int count = 0; count < myArray.length; count++){
			System.out.print("Enter Number " + (count + 1) + ": ");
			myArray[count] = input.nextInt();    // Read Integer input			
		}
		
		//Find even numbers in 'myArray' and copy them to 'evenArray'
		for (int count = 0; count < myArray.length; count++){
			if(myArray[count] % 2 == 0){
				evenArray[evenCount] = myArray[count];
				evenCount++;
			}
		}
		
		//Print the 'myArray'
		System.out.println("\nmyArray Contents:");
		for (int count = 0; count < myArray.length; count++){
			System.out.print(myArray[count] + " ");
		}
		
		System.out.println();
		
		//print the 'evenArray'
		System.out.println("\nevenArray Contents:");
		for (int count = 0; count < evenCount; count++){
			System.out.print(evenArray[count] + " ");
		}
		
		System.out.println();
	}
}