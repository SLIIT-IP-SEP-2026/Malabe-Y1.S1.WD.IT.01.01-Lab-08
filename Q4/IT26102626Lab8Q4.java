import java.util.Scanner;
public class IT26102626Lab8Q4{
	public static void main(String[]args){
		
		int userInput;
		int searchID;
		
		boolean status = true;
		boolean found = false;
		
		//Declare the Array with size of 8
		int studentArray[] = new int[8];
		
		//Create a Scanner object for input
		Scanner input = new Scanner(System.in);
		
		//Input Student IDs into the array
		for(int count = 0; count < studentArray.length;count++){
			
			while(status){
				System.out.print("Enter Student ID for Student " + (count + 1) + ": ");
				userInput = input.nextInt();
				
				//Validate if input value is positive
				if(userInput>0){
					//Store the positive student ID
					studentArray[count] = userInput;
					//Exit inner while loop only, on valid input
					break; 
				}else{
					//Display error
					System.out.println("Error: Please Enter ONLY Positive Numbers");
				}
			}
			
		}
		
		System.out.println();
		
		//Ask user to enter a Student ID to search
		System.out.print("Enter a Student ID to Search: ");
		searchID = input.nextInt();
		
		//Search for the Student ID in the array
		for(int count = 0;count<studentArray.length;count++){
			if(studentArray[count] == searchID){
				found = true;
				//Exit the for loop if found
				break;
			}
			
		}
		
		System.out.println();
		
		//Display the result
		if(found){
			System.out.println("Student is Available");
		}else{
			System.out.println("Student is Not Available");
		}
	}
}