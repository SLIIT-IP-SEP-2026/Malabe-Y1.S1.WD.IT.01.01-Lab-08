
import java.util.Scanner;

public class IT26102353Lab8Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[6];

        for (int i = 0; i < 6; i++) {

            System.out.print("Enter a positive number: ");
            numbers[i] = input.nextInt();

            while (numbers[i] <= 0) {
                System.out.println("Invalid number. Enter a positive number.");

                System.out.print("Enter a positive number: ");
                numbers[i] = input.nextInt();
            }
        }

        int max = numbers[0];

        for (int i = 1; i < 6; i++) {

            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Maximum number = " + max);
    }
}
