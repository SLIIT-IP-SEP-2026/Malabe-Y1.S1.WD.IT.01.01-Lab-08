import java.util.Scanner;

public class IT26102472Lab8Q1B {

    public static void main(String[] args) {
        int[] myArray = new int[5];
        int numberCount = 0;
		int evenSum = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 5 Numbers:");

        while (numberCount < 5) {
            System.out.print("Enter Number " + (numberCount + 1) + ": ");
            myArray[numberCount] = input.nextInt();
            numberCount++;
        }

        System.out.println("\nArray in Forward Order:");

		for (int i = 0; i < 5; i++) {
			
			System.out.print(myArray[i] + " ");
			
		}
		
		System.out.println();
		
		System.out.println("evenArray Contents:");
		
		for (int i = 0; i < 5; i++) {
			if (myArray[i] % 2 == 0) {
				System.out.print(myArray[i] + " ");
			}
		}
	}
}