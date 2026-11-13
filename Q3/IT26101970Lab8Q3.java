import java.util.Scanner;

public class IT26101970Lab8Q3{

    public static void main(String [] args){

        int numberArray[] = new int[6];
        int numberCount = 0;
        int userInput;

        // Create a Scanner object for input
        Scanner input = new Scanner (System.in);

        // Capture 10 Positive Numbers into the array
        while (numberCount < 6){
            System.out.print("Enter a Positive Number (" + (numberCount + 1) + "/6) : ");
            userInput = input.nextInt();

            if (userInput > 0){
                numberArray[numberCount] = userInput;
                numberCount++;
            }
            else {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            }
        }
        // Finding the maximum number in the array
        int maxNumber = numberArray[0];

        for (int count = 0; count < numberArray.length; count++){
            if (numberArray[count] > maxNumber){
                maxNumber = numberArray[count];
            }
        }

        // Printing the Number Array
        System.out.println("\narray Contents: ");
        for (int count = 0; count < numberArray.length; count++){
            System.out.print(numberArray[count] + " ");
        }

        System.out.println();

        // Display the Maximum Number
        System.out.println("The Maximum Number Entered: " + maxNumber);
    }
}