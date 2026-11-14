import java.util.Scanner;

public class IT26102095Lab8Q4{
	
	public static void main(String[] args){
		
		int userInput;
		int serchID;
		
		boolean status = true;
		boolean found = true;
		
		int studentsArray[] = new int[8];
		
		Scanner input = new Scanner(System.in);
		
		for (int count = 0 ; count < studentsArray.length ; count++ ) {
			
			while (status) {
				
				System.out.print("Enter Student ID for Student " + (count + 1) + ": ");
				userInput = input.nextInt();
				
				if (userInput > 0) {
					studentsArray[count] = userInput;
					break ;
				}
				else {
					System.out.println("Error : Please Enter ONLY Positive Numbers");
				}
			}
		}
		System.out.println();
		
		System.out.print("Enter a Student ID to Serch: ");
		serchID = input.nextInt();
		
		for (int count = 0 ; count < studentsArray.length ; count++ ) {
			if (studentsArray[count] == serchID ) {
				found = true ;
				break ;
			}
		}
		System.out.println();
		
		if (found) {
			System.out.println("Student is Available");
		}
		else {
			System.out.println("Student is Not Available");
		}
	}
}