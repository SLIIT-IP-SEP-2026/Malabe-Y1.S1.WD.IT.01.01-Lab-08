import java.util.Scanner;

public class IT26102590Lab8Q1 {

	public static void main (String[]args){
	
	Scanner input=new Scanner(System.in);
	
	int myArray [] = new int [5]; //declaring
	int count=0;
	int numCount=0;
	while (count<5) //storing values
	{	
		++numCount;
		System.out.print ("Enter the number " +numCount +" :");
		myArray[count]= input.nextInt();
		
		count++;
		
	}
	System.out.println();
	System.out.print ("Entered Value reversed:");
	for (int i=4; i>=0; i--){
		System.out.print(" "+ myArray[i]);
	}
	
	
	}
} 