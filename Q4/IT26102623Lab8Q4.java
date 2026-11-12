import java.util.Scanner;
public class IT26102623Lab8Q4
{
	public static void main(String[] args)
	{
		int userInput ;
		int searchID  ;
		
		boolean status = true  ;
		boolean found = false  ;
		
		// Declare the array with size of 8
		int[] studentArray = new int[8];
		
		// Create a Scanner object for input 
		Scanner input = new Scanner(System.in);
		
		// Input student IDs into the Array
		for (int count = 0; count < studentArray.length ; count ++)
		{
			while(status)
			{
				System.out.print("Enter Student ID for Student " + (count + 1) + ": ") ;
				userInput = input.nextInt() ;
				
			
				if (userInput > 0)
				{
					studentArray[count] = userInput ;
					break;
				}
				
				else
				{
					System.out.println("Error: Please Enter ONLY Positive Numbers") ;
				}
			}
		}
			System.out.println();
				
			//Ask User to enter the student ID to search
			System.out.print("Enter a Student ID to Search: ")  ;
			searchID = input.nextInt() ;
				
			// Search If the student on the list 
			for (int count=0 ; count < studentArray.length ; count++)
			{
				if (searchID == studentArray[count])
				{	
					found = true ;
					break ; // EXIT the loop if Found
				}
			}
				
			System.out.println();
				
			//Display the results
			if (found)
			{
				System.out.println("Student is Available") ;
			}
			else
			{
					System.out.println("Student is Not Available") ;
			}
	}
}
			
				
			
			
				
 