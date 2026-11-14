import java.util.Scanner;

public class IT26102590Lab8Q1B {

	public static void main (String[]args){
	
	Scanner input=new Scanner(System.in);
	
	int myArray [] = new int [5]; 
	int evenArray[]= new int [myArray.length];
	
	
	
	 //storing values
	 
	for (int numCount=0; numCount< myArray.length; numCount++)
	{	
		System.out.print ("Enter the number " +(numCount+1) +" :");
		myArray[numCount]= input.nextInt();
		
	}
	
	
	//get the even numbers , i is my array count and j is even array count
	
	System.out.println();
	System.out.print("Even Numbers are:");
	for(int i=0;i<5;i++){
	
		for (int j=0; j<myArray.length; j++){
		
		
			if (myArray[i]%2==0){
		
			evenArray[j] = myArray[i];
			System.out.print(" "+evenArray[j]);
					}
					break;
		
			}
			
	 
	}
	
	}
} 