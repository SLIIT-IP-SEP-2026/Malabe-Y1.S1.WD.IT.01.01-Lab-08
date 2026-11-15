import java.util.Scanner;
import java.util.Scanner;
public class IT26102626Lab8Q1B{
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
			
		//Creating an Array to store even number values, with a size of 5 incase all the numbers are even
		int evenArray[] = new int[5];
		//Creating a seperate variable for array indexes of evenArray 
		int evenCount = 0;
		
		//Identifying even numbers from myArray through an if condition and storing them in evenArray
		for(count=0;count<myArray.length;count++){
			if(myArray[count]%2 == 0){
				evenArray[evenCount] = myArray[count];
				evenCount++;
			}
		}
			
		//Displaying array elements of myArray
		System.out.println();
		System.out.println("myArray Contents:");
		for(count=0;count<myArray.length;count++){
			System.out.print(myArray[count] + " ");
		}
		
		//Displaying array elements of evenArray
		System.out.println();
		System.out.println("evenArray Contents:");
		for(evenCount=0;evenCount<evenArray.length;evenCount++){
			System.out.print(evenArray[evenCount] + " ");
		}
	}
}