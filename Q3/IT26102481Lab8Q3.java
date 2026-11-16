import java.util.Scanner;
	public class  IT26102481Lab8Q3{
		public static void main(String[] args){
			Scanner input=new Scanner(System.in);
			
			int[] number= new int[6];
			int i;
			
			for(i=0;i<6;i++){
				System.out.print("enter a positive number ("+(i+1)+"/6): ");
				number[i]=input.nextInt();
				
				if(number[i]<=0){
					System.out.println("error: please enter only positive numbers");
					i--;
					
				}
			}
			
		System.out.println("A array contents: ");
		for(i=0;i<6;i++){
		System.out.print(number[i]+" ");
		}
		System.out.println();
		
		int max=number[0];
		
		for(i=1;i<6;i++){
			if(max<number[i]){
				max = number[i];
			}
			
		}
		System.out.print("the maximum number entered: "+ max);
		
		
		
		}
	}