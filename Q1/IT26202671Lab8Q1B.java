import java.util.Scanner;

public class IT26202671Lab8Q1B {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Create 'myArray' and 'evenArray', both with a size of 5
        int[] myArray = new int[5];
        int[] evenArray = new int[5];
        
        System.out.println("Enter 5 Numbers:");
        
        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            myArray[i] = input.nextInt();
        }
        
        // Separate index tracker to place even numbers consecutively in 'evenArray'
        int evenIndex = 0;
        
        // Loop through 'myArray', check for even numbers, and copy them to 'evenArray'
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0) {
                evenArray[evenIndex] = myArray[i];
                evenIndex++;
            }
        }
        
        System.out.println("\nmyArray Contents:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        
        // Print all elements of 'evenArray' (unfilled slots automatically display as 0)
        System.out.println("\n\nevenArray Contents:");
        for (int i = 0; i < evenArray.length; i++) {
            System.out.print(evenArray[i] + " ");
        }
        
        input.close();
    }
}