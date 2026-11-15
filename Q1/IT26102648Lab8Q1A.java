import java.util.Scanner;

public class IT26102648Lab8Q1A{
	public static void main(String[]args){
		// Array Declaration
		int[] myArray = new int[5];
		
		//Scanner Declaration
		Scanner input = new Scanner(System.in);
		
		//Getting inputs to the array
		System.out.println("Enter 5 Numbers:");
		for (int number = 0;number < myArray.length; number++){
			System.out.print("Enter Number "+ (number+1) + ": ");
			
			//Assigning the number into the array
			myArray[number] = input.nextInt();
		}
		
		System.out.println();
		
		//Printing the Array in reverse order
		System.out.println("Array in Reverse Order:");
		for(int number = myArray.length-1; number >= 0; number--){
			System.out.print(myArray[number]+" ");
		}
		
	}
}