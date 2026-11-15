import java.util.Scanner;
public class IT26102407Lab8Q3{
	
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		
		int integerArray[] = new int[6];
		int i=0, num;
		
		for(i=0; i<6; i++){
			
			System.out.print("Enter a positive Number (" + (i+1) + "/6): ");
			num = input.nextInt();
			
			if (num>0){
				
				integerArray[i] = num;
				
			}else{
				
				System.out.println("Error: Please Enter ONLY Positive Numbers");
				i--;
			}
			
		}
		
		int max_num = integerArray[0];
		
		for(i=0; i<6; i++){
			
			if(max_num < integerArray[i]){
				
				max_num = integerArray[i];
				
			}
			
		}
		
		System.out.println(" ");
		System.out.println("Array Contents: ");
		
		for(i=0; i<6; i++){
			
			System.out.print(integerArray[i] + " ");
			
		}
		
		System.out.println(" ");
		System.out.println("The Maximum Number Entered: " + max_num);
		
	}
	
}