import java.util.Scanner;

public class IT26102648Lab8Q3{
	public static void main(String[]args){
		// Variable/Array Declaration
		int[] numbers = new int[6];
		int number,maxNumber = 0;
		//Declaring the scanner
		Scanner input = new Scanner(System.in);
		
		//Inputting 6 numbers
		for(int i = 1; i<=6 ; i++){
			
			System.out.print("Enter a Positive Number (" + i +"/6): ");
			number = input.nextInt();
			
			//Validity checking
			while (number <= 0){
				System.out.println("Error: Please Enter ONLY Positive Numbers");
				System.out.print("Enter a Positive Number (" + i +"/6): ");
				number = input.nextInt();
			}
			
			numbers[i-1] = number;
		}
		
		System.out.print("\n\n");
		
		//Printing Array and checking the max number
		System.out.println("Array Contents:");
		for(int j = 0 ; j<=5 ; j++){
			System.out.print(numbers[j] + " ");
			if (maxNumber < numbers[j]){
				maxNumber = numbers[j];
			}
		}
		
		System.out.println();
		
		//Printing the max number
		System.out.println("The Maximum Number Entered: "+ maxNumber);
	}
}