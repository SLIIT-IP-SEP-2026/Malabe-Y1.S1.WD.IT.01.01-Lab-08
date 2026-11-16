import java.util.Scanner;

public class IT26102671Lab8Q3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Create an integer array of size 6
        int[] numbers = new int[6];

        int numberCount = 0;

        // Keep asking until 6 positive numbers are stored
        while (numberCount < 6) {

            System.out.print("Enter a Positive Number (" + (numberCount + 1) + "/6): ");
            int number = input.nextInt();

            // Check whether the number is positive
            if (number <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            } else {
                numbers[numberCount] = number;
                numberCount++;
            }
        }

        // Find the maximum number
        int maximum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }
        }

        System.out.println("\nArray Contents:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\nThe Maximum Number Entered: " + maximum);
    }
}