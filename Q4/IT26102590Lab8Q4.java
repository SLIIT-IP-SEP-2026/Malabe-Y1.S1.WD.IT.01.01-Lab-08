import java.util.Scanner;

public class IT26102590Lab8Q4 {

	public static void main(String[]args){
	
	Scanner input= new Scanner (System.in);
	
	int studentArray[] = new int [8];
	int count;
	
	
	
	//Enter + selection
	
	for (count=0; count< studentArray.length;count++){
	
	System.out.print("Enter the student ID number: ");
	
	while (true){
		studentArray[count]= input.nextInt();
		if (studentArray[count]>0){
			
			break;
			
		}else 
			{
				System.out.println("Error: Please enter a VALID STUDENT ID...");
				}
		
	}
	
	}
	
	//get the studentID
	
	System.out.println();
	System.out.println("Enter Student ID: ");
	int studentId = input.nextInt();
	
	for (int i=0; i<studentArray.length; i++){
		
		if (studentArray[i]==studentId){
			
			System.out.println ("Student Avaliable!");
			break;
		}
		
		
		
		
	} System.out.println("Student Unavaliable...");
	
	
	
	
	}
	
}
	

