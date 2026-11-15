import java.util.Scanner;

public class IT26101227Lab8Q1A{
	
	public static void main (String[] args){
	
    // Declare an array named 'myArray' of size 5 for integers	
    int myArray [] = new int[5];
	
	// Create a Scanner object for input
	Scanner input = new Scanner (System.in);
	
	System.out.println("Enter 5 Numbers: ");
	
	// Capture 5 Numbers from user 
	for (int count = 0; count < myArray.length; count++){
		System.out.print("Enter Number " + (count + 1) + ": ");
		myArray[count] = input.nextInt();
	}
	
	//Print the array in Reverse Order
	System.out.println("\nArray in Reverse Order:");
	for (int count = myArray.length - 1; count >= 0; count--){
		System.out.print(myArray[count] + " ");
	}
	
  }
}