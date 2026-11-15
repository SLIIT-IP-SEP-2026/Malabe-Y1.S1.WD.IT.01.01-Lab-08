import java.util.Scanner;

public class IT26102024Lab8Q4{
	public static void main (String[]args){

		int studentID, searchID;
		int count = 0;
		boolean found = false;

		int[] studentsArray = new int[8];

		Scanner input = new Scanner(System.in);

		while (count < 8){

			System.out.print("Enter Student ID for Student "+(count+1)+": ");
			studentID = input.nextInt();

			if (studentID <= 0){

				System.out.println("Error: Please Enter ONLY Positive Numbers");

			}else{

				studentsArray[count] = studentID;
				count++;

			}
		}

		System.out.println();
		System.out.print("Enter a Student ID to Search: ");
		searchID = input.nextInt();

		for (int i = 0; i < 8; i++){
			if (studentsArray[i] == searchID){
				found = true;
			}
		}

		System.out.println();

		if (found){
			System.out.println("Student is Available");
		}else{
			System.out.println("Student is Not Available");
		}

	}
}
