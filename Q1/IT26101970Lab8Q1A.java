import java.util.Scanner;

public class IT26101970Lab8Q1A{

    public static void main(String [] args){

        // Create Scanner input
        Scanner input = new Scanner (System.in);

        // Initializing the array & declaring variables
        int myArray[] = new int[5];
        int numberCount = 0;
        int userInput;

        // Capturing the 5 numbers into the Array
        System.out.println("Enter 5 Numbers: ");

        while(numberCount < 5){
            System.out.print("Enter Number " + (numberCount + 1) + " : ");
            userInput = input.nextInt();

            myArray[numberCount] = userInput;
            numberCount++;
        }

        // Printing the number array
        System.out.println("\nArray in Reverse Order: ");
        for (int count = myArray.length - 1; count >= 0; count--){
            System.out.print(myArray[count] + " ");
        }
    }
}