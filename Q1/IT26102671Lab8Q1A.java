import java.util.Scanner;

public class IT26102671Lab8Q1A {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Create an integer array named 'myArray' with a fixed size of 5
        int[] myArray = new int[5];
        
        System.out.println("Enter 5 Numbers:");
        
        // Loop from index 0 to 4 to take 5 numbers from the user and store them
        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            myArray[i] = input.nextInt();
        }
        
        System.out.println("\nArray in Reverse Order:");
        
        // Loop backward from the last index (4) down to 0 to print in reverse
        for (int i = myArray.length - 1; i >= 0; i--) {
            System.out.print(myArray[i] + " ");
        }
        
        input.close();
    }
}