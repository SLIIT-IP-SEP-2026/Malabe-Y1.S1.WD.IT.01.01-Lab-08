import java.util.Scanner;

public class IT26102396Lab8Q3{
	
	public static void main(String[] args){
		
		int numberArrey[] =new int[6];
		int numberCount = 0;
		int userInput;
		
		Scanner input = new Scanner(System.in);
		
		while (numberCount < 6){
			
			System.out.print("Enter a positive number(" + (numberCount + 1) + "/6): ");
			userInput = input.nextInt();
			
			if (userInput > 0){
				numberArrey[numberCount] = userInput;
				numberCount++;
			}
			else {
				System.out.println("Error: Please enter only positive numbers");
				
			}
		}
		
		int maxNumber = numberArrey[0];
		
		for(int count = 0; count < numberArrey.length; count++){
			if(numberArrey[count] > maxNumber){
				maxNumber = numberArrey[count];
			}
		}
		
		System.out.println("\nArray Contents:");
		for (int count = 0; count < numberArrey.length; count++){
			System.out.print(numberArrey[count] + " ");
		}
		
		System.out.println();
		
		System.out.println("The Maximum Number Enterd: " + maxNumber);
	}
	
}