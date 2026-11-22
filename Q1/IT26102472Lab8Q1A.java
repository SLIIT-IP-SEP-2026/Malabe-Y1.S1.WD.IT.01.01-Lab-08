import java.util.Scanner;

public class IT26102472Lab8Q1A {

    public static void main(String[] args) {
        int[] myArray = new int[5];
        int numberCount = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 5 Numbers:");

        while (numberCount < 5) {
            System.out.print("Enter Number " + (numberCount + 1) + ": ");
            myArray[numberCount] = input.nextInt();
            numberCount++;
        }

        System.out.println("\nArray in Reverse Order:");
        
        
        for (int i = 4; i >= 0; i--) {
            System.out.print(myArray[i] + " ");
        }
    }
}