import java.util.Scanner;
public class IT26102407Lab8Q4{
	
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		
		int studentArray[] = new int[8];
		int i=0, studentID;
		boolean Available = false;
		
		for(i=0; i<8; i++){
			
			System.out.print("Enter Student ID for Student " + (i+1) + ": ");
			studentID = input.nextInt();
			
			if (studentID>0){
				
				studentArray[i] = studentID;
				
			}else{
				
				System.out.println("Error: Please Enter ONLY Positive Numbers");
				i--;
			}
			
		}
		
		System.out.println(" ");
		System.out.print("Enter a Student ID to Search: ");
		int searchID = input.nextInt();
		
		for(i=0; i<8; i++){
			
			while(true){
				
				if(searchID == studentArray[i]){
				
				Available = true;
				System.out.println(" ");
				System.out.println("Student is Available");
				
				}
				
				break;
				
			}
			
		}
		
		if(Available == false ){
			
			System.out.println(" ");
			System.out.println("Student is Not Available");
			
		}
		
	}
	
}