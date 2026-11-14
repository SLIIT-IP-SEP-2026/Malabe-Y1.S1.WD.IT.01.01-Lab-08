import java.util.Scanner;

public class IT26102590Lab8Q3 {

	public static void main(String[]args){
	
	Scanner input= new Scanner (System.in);
	
	int myArray[] = new int [6];
	int count;
	
	for (count=0; count< myArray.length;count++){
	
	System.out.print("Enter the number "+(count+1) +": ");
	
	
	
	
	//selection
	
	while (true){
		myArray[count]= input.nextInt();
		if (myArray[count]>0){
			
			break;
			
		}else 
			{
				System.out.println("Error: Please enter a positive number...");
				}
		
	}
	
	}
	
	//print array contents
	System.out.println();
	System.out.println("Array Contents: ");
	
	for (int i=0; i<myArray.length; i++){
		
		System.out.print(myArray[i] +" ");
	}
	System.out.println();
	
	
	
	//getting the max number
	
	int maxNumber= myArray[0];
	
	for (int i=1;i<myArray.length;i++){
	
	if (myArray[i]>maxNumber){
		
		maxNumber= myArray[i];
	}
	
	}
		
		System.out.println("Maximum Number is: " +maxNumber);
	}
	
}
