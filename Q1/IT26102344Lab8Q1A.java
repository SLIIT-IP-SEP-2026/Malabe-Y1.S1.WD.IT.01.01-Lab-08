import java.util.Scanner;
    
	 public class IT26102344Lab8Q1A {
	   public static void main(String[]args) {
		   
		Scanner input = new Scanner(System.in);
		
		//creat the array
		int myarray[] = new int[5];
		int i;
		
		//to get user input 
		System.out.println("Enter 5 Numbers");
		for(i=0; i<5; i++) {
			System.out.print("Enter Number " + (i + 1) + ": ");
			myarray[i] = input.nextInt();
		}
		
		System.out.println("\nArray in reverse order:");
	    for(i=4; i>=0; i--) {
			System.out.print(myarray[i] + " ");
		}
		
	   }
	 }
        		