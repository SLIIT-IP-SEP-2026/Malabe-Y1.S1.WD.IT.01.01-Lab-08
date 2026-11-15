import java.util.Scanner;
public class IT26102626Lab8Q1A{
	public static void main(String[]args){
		
		//Creating a Scanner object for input 
		Scanner input = new Scanner(System.in);
		
		//Creating an Array to store the values entered by the user
		int myArray[] = new int[5];
		int count = 0;
		
		System.out.println("Enter 5 numbers");
		
		//Obtain the input of the user using a for loop and store it in myArray
		for(count = 0;count<myArray.length;count++){
			System.out.print("Enter Number " + (count + 1)+ ": ");
			myArray[count] = input.nextInt();
			}
			
		//Displaying array elements in reverse order 
		System.out.println();
		System.out.println("Array in Reverse Order:");
		for(count= myArray.length - 1;count>=0;count--){
			System.out.print(myArray[count] + " ");
		}
	}
}