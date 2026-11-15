import java.util.Scanner;

public class IT26102412Lab8Q4{
	public static void main (String[]args){
		
		// Declare an array and initialize variables
		int studentsArray[] = new int[8];
		int idSearch, value;
		int stuCount = 0;
		
		// Create a Scanner object to get user input
		Scanner input = new Scanner(System.in);
		
		// Get 8 positive student IDs from the user using a while loop
		while(stuCount < studentsArray.length){
			System.out.print("Enter Student ID for Student "+ (stuCount+1) +": ");
			value = input.nextInt();
			if(value > 0){
				studentsArray[stuCount] = value;
				stuCount++;
			}else{
				System.out.println("Error: Please Enter ONLY Positive Numbers");
			}
		}
		
		// Ask the user to enter a student ID to search
		System.out.print("\nEnter a Student ID to Search: ");
		idSearch = input.nextInt();
		
		// Search for the entered student ID in the array using a for loop
		for(int count = 0; count < studentsArray.length; count++){
			if(idSearch == studentsArray[count]){
				System.out.println("\nStudent is Available");
			}
		}
	}
}