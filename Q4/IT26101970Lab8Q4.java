import java.util.Scanner;

public class IT26101970Lab8Q4{

    public static void main(String [] args){

        int userInput;
        int searchID;

        boolean status = true;
        boolean found = false;

        // Declaring the Array with size of 8
        int[] studentsArray = new int[8];

        // Create a scanner object for input
        Scanner input = new Scanner (System.in);

        // Input Students IDs into the array
        for (int count = 0; count < studentsArray.length; count++){

            while(status){
                System.out.print("Enter Student ID for Student " + (count + 1) + ": ");
                userInput = input.nextInt();

                if (userInput > 0){
                    studentsArray[count] = userInput;
                    break;
                }
                else {
                    System.out.println("Error: Please Enter ONLY Positive Numbers");
                }
            }
        }
        System.out.println();

        // Ask user to input a Student ID to search
        System.out.print("Enter a Student ID to Search: ");
        searchID = input.nextInt();

        // Search for the Student ID in the array
        for (int count = 0; count < studentsArray.length; count++){
            if (studentsArray[count] == searchID){
                found = true;
                break;
            }
        }

        System.out.println();

        // Display the results
        if (found){
            System.out.println("Student is Available");
        }
        else {
            System.out.println("Student is Not Available");
        }
    }
}