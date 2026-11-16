import java.util.Scanner;

public class IT26102671Lab8Q4 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Create an array to store 8 Student IDs
        int[] studentsArray = new int[8];
        
        // Input loop with validation to ensure only positive numbers are accepted
        for (int i = 0; i < studentsArray.length; i++) {
            System.out.print("Enter Student ID for Student " + (i + 1) + ": ");
            int id = input.nextInt();
            
            if (id <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
                i--; // Decrement i so the loop repeats the prompt for the same student
            } else {
                studentsArray[i] = id;
            }
        }
        
        System.out.print("\nEnter a Student ID to Search: ");
        int searchId = input.nextInt();
        
        // Flag to track whether the searched Student ID exists in the array
        boolean isAvailable = false;
        
        // Search through the array for a matching Student ID
        for (int i = 0; i < studentsArray.length; i++) {
            if (studentsArray[i] == searchId) {
                isAvailable = true;
                break; // Stop searching once a match is found
            }
        }
        
        // Display the final search result
        if (isAvailable) {
            System.out.println("\nStudent is Available");
        } else {
            System.out.println("\nStudent is Not Available");
        }
        
        input.close();
    }
}
