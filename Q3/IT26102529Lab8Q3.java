
import java.util.Scanner;

public class IT26102529Lab8Q3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[6];

        for (int i = 0; i < 6;i++ ) {

            System.out.print("Enter a Positive Number (" + (i + 1) + " ");
            int num = input.nextInt();

            if (num > 0) {

                numbers[i] = num;

            } else {

                System.out.println("Error: Please Enter  Positive numbers");

            }
        }

        System.out.println("Array Contents:");

        for (int i = 0; i < 6; i++) {
            System.out.print(numbers[i] + " ");
        }

        int max = numbers[0];

        for (int i = 0; i < 6; i++) {

            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("The Maximum Number is: " + max);

    }
}
