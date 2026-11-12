import java.util.Scanner;
public class IT26102623Lab8Q1B{
	public static void main(String[] args){
		
		int myArray[] = new int[5];
		int count = 0;
		int evenArray[] = new int[5];
		int evenCount = 0;
		
		//  create a scanner object for input
		Scanner input = new Scanner(System.in);
		
		//to get 5 numbers
		for (count = 0; count<= 4;count++){
			System.out.print("Enter Number " + (count+1)+": ");
			myArray[count] = input.nextInt();
			if (myArray[count] % 2 == 0){
				evenArray[evenCount] =myArray[count];
				evenCount++;
			}
			
			
		}	
		// to print the myArray contents
		System.out.println();
		System.out.println("myArray Contents:");
		
		for (count = 0; count<=4; count++){
			System.out.print(myArray[count] +" ");
		}
		// to print the evenArray contents
		System.out.println();
		
		System.out.println("\nevenArray Contents:");
		for (evenCount = 0; evenCount<=4; evenCount++){
			System.out.print(evenArray[evenCount] +" ");
		
	}
}
}