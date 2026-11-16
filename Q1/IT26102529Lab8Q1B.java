import java.util.Scanner;

public class IT26102529Lab8Q1B{
public static void main(String[]args){

Scanner input=new Scanner (System.in);

int[] myArray=new int[5];
int[] evenArray=new int[5];

System.out.println("Enter 5 numbers: ");
for(int i=0; i<5; i++){
     
	 System.out.println("Enter number"+(i+1)+ ": ");
	 myArray[i]=input.nextInt();

}

int j=0;

for (int i=0; i<5; i++){
	
         if(myArray[i]%2 == 0){
			 
			 evenArray[j]=myArray[i];
			 j++;
		 }
}
       System.out.println("myArray Contents:");

        for (int i = 0; i < 5; i++) {

         System.out.print(myArray[i] + " ");
		}
		
		
		 System.out.println("\nevenArray Contents:");

        for (int i = 0; i < 5; i++) {

            System.out.print(evenArray[i] + " ");

        }

    

}


}