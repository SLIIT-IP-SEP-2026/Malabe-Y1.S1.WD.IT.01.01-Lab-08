import java.util.Scanner;

public class IT26101970Lab8Q1B{

    public static void main(String [] args){

        // Create Scanner input
        Scanner input = new Scanner (System.in);

        // Initializing the array & declaring variables
        int myArray[] = new int[5];
        int evenArray[] = new int[5];
        int numberCount = 0;
        int evenCount = 0;
        int userInput;

        // Capturing the 5 numbers into the Array
        System.out.println("Enter 5 Numbers: ");

        while(numberCount < 5){
            System.out.print("Enter Number " + (numberCount + 1) + " : ");
            userInput = input.nextInt();

            myArray[numberCount] = userInput;

            if (userInput % 2 == 0){
                evenArray[evenCount] = userInput;
                evenCount++;
            }

            numberCount++;
        }

        // Printing the number array
        System.out.println("\nmyArray Contents: ");
        for (int count = 0; myArray.length > count; count++){
            System.out.print(myArray[count] + " ");
        }

        // Printing the even number array
        System.out.println("\nevenArray Contents: ");
        for (int count = 0; evenArray.length > count; count++){
            System.out.print(evenArray[count] + " ");
        }
    }
}