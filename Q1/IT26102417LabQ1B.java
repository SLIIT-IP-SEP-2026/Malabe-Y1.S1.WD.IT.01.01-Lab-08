import java.util.Scanner;

public class IT26102417LabQ1B {
	public static void main(String[]args){
		
		//create arrays
		int [] myArray = new int[5];
        int [] evenArray = new int [5];
 
       Scanner input = new Scanner(System.in);

       System.out.println("Enter 5 numbers :");	 
	
	  // to get 5 numbers
	  for(int i = 0 ; i < myArray.length ; i++){
		 System.out.print("Enter number" + (i + 1) + ":");
		 myArray[i] = input.nextInt();
	 }
	   
	   //print the numbers 
	   System.out.println("\nmyArray contents:");
	  for (int i = 0 ; i<myArray.length; i++){
		  System.out.println(myArray[i] + " ");
	  }
		  
	  
	     System.out.println("\nEven numbers:");		
		 
      for (int i = 0 ; i < myArray.length  ; i++){
		 if(myArray[i] % 2 == 0 ){
		evenArray[i] = myArray[i];
		
		System.out.print( evenArray[i] + " ");
			
					
	
		}	
	}
				
		
	}


}