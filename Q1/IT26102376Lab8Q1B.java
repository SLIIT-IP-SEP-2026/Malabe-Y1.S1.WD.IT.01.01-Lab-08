import java.util.Scanner;

public class IT26102376Lab8Q1B
{
   public static void main(String [] args)
   {
	   Scanner input = new Scanner(System.in);
	   
	   int numbers = 0;
	   
	   int [] myArray = new int[5]; 
	   int [] evenArray = new int[5];
	   
	   System.out.println("Enter 5 Numbers : ");
	   
	   for (int count = 0 ; count < 5 ; count++){   
		System.out.print("Enter " +(count+1) +" Number : ");
		myArray[count] =  input.nextInt();
	   }
	   
	   System.out.println();
	   System.out.println("myArray Contents :");
	   for (int count = 0 ; count<5 ; count++){
		   System.out.print(myArray[count] + " ");
	   }
	   
	   System.out.println();
	   System.out.println();
	   
	   int evenIndex = 0;
	   for (int count = 0 ; count<5 ; count++){
		   if (myArray[count] % 2 == 0 ){
		   evenArray[evenIndex] = myArray[count];
		   evenIndex++;
		   }
	   }
	   System.out.println("evenArray Contents :");
	   for (int count = 0 ; count<5 ; count++){
		   System.out.print(evenArray[count] + " ");
	   }
	   System.out.println();
   }
}
	   
	   
	   