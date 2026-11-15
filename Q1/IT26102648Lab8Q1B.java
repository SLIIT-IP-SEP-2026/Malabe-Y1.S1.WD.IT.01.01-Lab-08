import java.util.Scanner;

public class IT26102648Lab8Q1B{
	public static void main(String[]args){
		// Array Declaration
		int[] myArray = new int[5];
		int count = 0;
		
		//Scanner Declaration
		Scanner input = new Scanner(System.in);
		
		//Getting inputs to the array
		System.out.println("Enter 5 Numbers:");
		for (int number = 0;number < myArray.length; number++){
			System.out.print("Enter Number "+ (number+1) + ": ");
			
			//Assigning the number into the array
			myArray[number] = input.nextInt();
		}
		
		//Checking the count of even numbers in myArray
		for(int number = 0; number < myArray.length; number++){
			if (myArray[number]% 2 == 0){
				count += 1;
			}
		}
		
		//Even Array Declaration
		int[] evenArray = new int[count];
		
		//Storing even numbers in even Array
		count = 0;
		for(int number = 0; number < myArray.length; number++){
			if (myArray[number]% 2 == 0){
				evenArray[count] = myArray[number];
				count += 1;
			}
		}
		
		System.out.println();
		
		//Printing myArray
		System.out.println("myArray Contents:");
		for(int number = 0; number < myArray.length; number++){
			System.out.print(myArray[number]+" ");
		}
		
		System.out.println();
		
		//Printing evenArray
		System.out.println("evenyArray Contents:");
		for(int number = 0; number < evenArray.length; number++){
			System.out.print(evenArray[number]+" ");
		}
	}
}