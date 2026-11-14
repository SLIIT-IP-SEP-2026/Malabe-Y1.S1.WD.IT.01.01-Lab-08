import java.util.Scanner;

public class IT26102396Lab8Q4 {
	
	public static void main(String[] args) {
		
		int userInput;
		int searchID;
		
		boolean status = true;
		boolean found = false;
		
		int[] studentsArray = new int[8];
		
		Scanner input = new Scanner(System.in);
		
		
		//Input IDs in to array
		for (int count = 0; count < studentsArray.length; count++) {
			
			while (status) {
				
				System.out.print("Enter Student ID for Student " + (count + 1) + ": ");
				userInput = input.nextInt();
				
				
				if (userInput > 0) {
					
					studentsArray[count] = userInput; //store the positive ID
					break; //exit inner while loop only, on valid input
				}
				
				else {
					System.out.println("Error: Please enter only positive numbers");
				}
			}
			
			
		}
		
		System.out.println();
		
		//Ask user to enter a student ID to search
		System.out.print("Enter a Student ID to Search: ");
		searchID = input.nextInt();
		
		for (int count = 0; count < studentsArray.length; count++) {
			
			if (studentsArray[count] == searchID){
				found = true;
				break;
			}
		}
		
		System.out.println();
		
		if (found) {
			System.out.println("Student is Available");
		}
		else{
			System.out.println("Student is Not Available");
		}
	}
	
	
}