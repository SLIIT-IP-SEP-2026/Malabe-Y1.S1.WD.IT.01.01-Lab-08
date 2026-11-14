
import java.util.Scanner;

public class IT26102095Lab8Q3 {
    public static void main(String[] args) {

        int numberArray[] = new int[6];
        int numbercount = 0;
        int userInput;

        Scanner input = new Scanner(System.in);

        while (numbercount < 6) {
            System.out.print("Enter a positive number (" +
                    (numbercount + 1) + "/6): ");

            userInput = input.nextInt();

            if (userInput > 0) {
                numberArray[numbercount] = userInput;
                numbercount++;
            }
            else {
                System.out.println(
                    "Error: Please Enter ONLY Positive Numbers");
            }
        }

        int maxnumber = numberArray[0];

        for (int count = 0; count < numberArray.length; count++) {
            if (numberArray[count] > maxnumber) {
                maxnumber = numberArray[count];
            }
        }

        System.out.println("\nArray Contents:");

        for (int count = 0; count < numberArray.length; count++) {
            System.out.print(numberArray[count] + " ");
        }

        System.out.println();

        System.out.println("The maximum number entered: " + maxnumber);

        
    }
}
