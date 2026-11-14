import java.util.Scanner;

public class IT26102376Lab8Q1A
{
   public static void main(String [] args)
   {
	   // Create a Scanner object for input
	   Scanner input = new Scanner(System.in);
	   
	   // Create 1D integer array
	   int [] myArray = new int[5];
	   
	   System.out.println("Enter 5 Numbers : ");
	   
	   for (int count = 0 ; count < 5 ; count++){   
		System.out.print("Enter " +(count+1) +" Number : ");
		myArray[count] =  input.nextInt();
	   }
	   
	   System.out.println();
	   System.out.println("Array in Reverse Ordedr :");
	   
	   for(int count = 4 ; count >= 0 ; count--){
		   System.out.print(myArray[count] + " ");
	   }
   }
}

	   