import java.util.Scanner;
	public class IT26102552Lab8Q4{
		public static void main(String[] args){
		
			
			int studentsArray[] = new int[8];
			 Scanner input = new Scanner(System.in);
			 
			for(int i = 0 ; i < 8 ; i++){
				
				System.out.print(" Enter a Student ID for Student " + (i + 1) + ":");
				studentsArray[i] = input.nextInt();
				
			while (studentsArray[i] <= 0 ) {
				System.out.println("Error: Please Enter ONLY Positive Numbers");
				System.out.print("Enter a Positive Number " + (i + 1) + ":");
				studentsArray[i] = input.nextInt();
				}
			}
			
			System.out.print("\nEnter a Student ID to Search: ");
            int searchID = input.nextInt();

            boolean found = false;
			
			for (int i = 0; i < 8; i++) {

            if (studentsArray[i] == searchID) {
                found = true;
                break;
            }
        }

			if (found) {
            System.out.println("\nStudent is Available");
        } else {
            System.out.println("\nStudent is Not Available");
        }

		 }
	}
			