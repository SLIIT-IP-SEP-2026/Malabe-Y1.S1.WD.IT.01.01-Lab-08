import java.util.Scanner;
	public class  IT26102481Lab8Q1B{
		public static void main(String[] args){
			Scanner input= new Scanner(System.in);
			
			int[] myArray = new int[5];
			int[] evenArray= new int[5];
			int i,j=0;
			
			for(i=0;i<5;i++){
				System.out.print("enter number "+(i+1)+":");
				myArray[i]=input.nextInt();
				if(myArray[i]%2==0){
					evenArray[j]=myArray[i];
					j++;
				}
			}
			
			System.out.println("my array contents: ");
			for(i=0;i<5;i++){
				System.out.print(myArray[i]+" ");
				
			}
			System.out.println();
			
			System.out.println("evenArray contents: ");
			for(j=0;j<5;j++){
				System.out.print(evenArray[j]+" ");
				
			}
			
			
			
		}
	}
			