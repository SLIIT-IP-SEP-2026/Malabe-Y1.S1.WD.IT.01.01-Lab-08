import java.util.Scanner;

    public class IT26102344Lab8Q3 {
      public static void main(String[]args) {
		
	    int numArray[] = new int[6];
		int count = 0;
		int userInput;
		
	Scanner input = new Scanner(System.in);
	 
	  while (count < 6) {
		  System.out.print("Enter a positive number (" + (count + 1) + "/6): ");
		  userInput = input.nextInt();
		  
	  if (userInput > 0) {
		  numArray[count] = userInput;
		  count++;
	  }
	  else {
		  System.out.println("Error: Please Enter ONLY Positive Numbers");
	  }
	  }
	  
	  int maxNumber = numArray[0];
	  
	   for (int ncount = 0; ncount < numArray.length; ncount++) {
		   if (numArray[ncount] > maxNumber) {
			   maxNumber = numArray[ncount];
		   }
	   }
	   
	   System.out.println("\nArray Contents:");
	   for (int ncount = 0;ncount < numArray.length; ncount++) {
		   System.out.print(numArray[ncount] + " ");
	   }
	   
	   System.out.println();
	   
	  System.out.println("The Maximun Number Entered: " + maxNumber);
	  
	  }
	  
	}
		  