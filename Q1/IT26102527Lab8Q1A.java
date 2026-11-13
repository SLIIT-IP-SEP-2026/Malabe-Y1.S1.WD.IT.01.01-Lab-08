import java.util.Scanner;
public class IT26102527Lab8Q1A{
	public static void main(String[] args){
		
		int myArray[] = new int[5];
		int count = 0;
		
		//  create a scanner object for input
		Scanner input = new Scanner(System.in);
		
		//to get the values to form the array
		for (count = 0; count<= 4;count++){
			System.out.print("Enter Number " + (count+1)+": ");
			myArray[count] = input.nextInt();
			
		}
		
		// to print the array in reverse
		for (count = 4; count>=0; count--){
			System.out.print(myArray[count] +" ");
		}
	}
}