import java.util.Scanner;
public class IT26102626Lab8Q3{
	public static void main (String[]args){
		
		//Creating an array to store user's input values
		int numberArray[] = new int[6];
		int count = 0;
		int userInput;
		
		//Create a Scanner object for input
		Scanner input = new Scanner(System.in);
		
		//Capture 6 positive numbers into the Array
		while(count<numberArray.length){
			System.out.print("Enter a Positive Number (" + (count+1) + "/6): ");
			userInput = input.nextInt();
			
			//Validate if entered number is positive
			if(userInput>0){
				numberArray[count] = userInput;
				count++;
			}else{
				System.out.println("Eroor: Please Enter ONLY Positive Numbers");
			}
		}	
			
			//Assigning the first array value as maximum number
			int maxNumber = numberArray[0];
			
			//Find the maximum number in the array
			for(count=0;count<numberArray.length;count++){
				if(numberArray[count]>maxNumber){
					maxNumber = numberArray[count];
				}
			}
			
			//Print the elements of the array
			System.out.println();
			System.out.println("Array Contents:");
			for(count=0;count<numberArray.length;count++){
				System.out.print(numberArray[count] + " ");
			}
			
			System.out.println();
			
			//Display the maxinum number
			System.out.println("The Maximum Number Entered: " + maxNumber);
		}
	}