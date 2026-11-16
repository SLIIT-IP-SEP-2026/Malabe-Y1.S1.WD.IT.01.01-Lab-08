import java.util.Scanner;
	public class  IT26102481Lab8Q4{
		public static void main(String[] args){
			Scanner input=new Scanner(System.in);
			
			int[] studentArray= new int[8];
			int i,enterId;
			
			for(i=0;i<8;i++){
				System.out.print("enter student ID for student "+(i+1)+":");
				studentArray[i]=input.nextInt();
				
				if(studentArray[i]<=0){
					System.out.println("error: please enter only positive numbers");
					i--;
					
				}
			}
			
					
			System.out.println();
			
					System.out.print("enter a student ID to search: ");
					enterId=input.nextInt();
					
					for(i=0;i<8;i++){
						if(enterId==studentArray[i]){
							System.out.println();
							System.out.print("student is available");
							
						}
						
					}
						
			
		}
	}