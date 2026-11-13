import java.util.Scanner;
public class IT26102527Lab8Q4{
	public static void main(String[] args){
		
		int userInput ;
		int searchID ;
		int i;
		
		boolean status = true;
		boolean found  = false;
		
		//create Student ID array 
		int studentsArray[] = new int[8];
		
		// creating Scanner object
		Scanner input = new Scanner(System.in);
		
		//obtain and store student ID
		for(i = 0;i< studentsArray.length;i++){
			
			while(status){
			System.out.print("Enter Student ID for Student " +(i+1)+":" );
			userInput = input.nextInt();
			
			//check wheter the ID is positive
				if (userInput>0){
					studentsArray[i] = userInput;
					break;
				}
				else{
					System.out.println("Error: Pleas Enter ONLY Positive Numbers");
				
				}
			}
				
		}
			// searching for a studentID
			System.out.println();
			System.out.print("Enter a Student ID to Search: ");
			searchID = input.nextInt();
			
			for (i = 0;i< studentsArray.length;i++){
				
				if (searchID == studentsArray[i]){
					found = true;
					break;
				}
			}	
				
				
			// Displaying the Message	
			System.out.println();	
			if (found){
					System.out.println("Student is Available");
				}
					
			else{
					System.out.println("Student is Not Available");
				
				}
	}
}
		

