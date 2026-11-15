import java.util.Scanner;

public class IT26102648Lab8Q4{
	public static void main(String[]args){
		// Variable/Array Declaration
		int[] students = new int[8];
		int studentID,searchStudentID;
		boolean found=false;
		
		//Declaring the scanner
		Scanner input = new Scanner(System.in);
		
		//Inputting 6 numbers
		for(int i = 1; i<=8 ; i++){
			
			System.out.print("Enter Student ID for Student "+ i +": ");
			studentID = input.nextInt();
			
			//Validity checking
			while (studentID <= 0){
				System.out.println("Error: Please Enter ONLY Positive Numbers");
				System.out.print("Enter Student ID for Student "+ i +": ");
				studentID = input.nextInt();
			}
			
			students[i-1] = studentID;
		}
		
		System.out.print("\n");
		
		//Getting An ID to search
		System.out.print("Enter a Student ID to Search: ");
		searchStudentID = input.nextInt();
		
		//Validity checking
		while (searchStudentID <= 0){
			System.out.println("Error: Please Enter ONLY Positive Numbers");
			System.out.print("Enter a Student ID to Search: ");
			searchStudentID = input.nextInt();
		}
		 
		System.out.println();
		
		//checking the array for the studentID
		for (int i =0;i <= 7; i++){
			if (searchStudentID == students[i]){
				found = true;
				break;
			}
		}
		
		//printing if the student is available or not
		if(found){
			System.out.println("Student is Available");
		}else{
			System.out.println("Student is Not Available");
		}
	}
}