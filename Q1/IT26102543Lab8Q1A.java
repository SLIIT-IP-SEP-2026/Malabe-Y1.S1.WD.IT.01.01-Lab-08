import java.util.Scanner;
public class IT26102543Lab8Q1A{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		int myArray[]=new int[5];
		int count=0;
		System.out.println("Enter 5 Numbers");
		for(count=0;count<myArray.length;count++){
			System.out.print("Enter Number " +(count+1) +":");
myArray[count]=input.nextInt();
		}
System.out.println();
System.out.println("Array in Reverse Order:");
for(count=myArray.length-1;count>=0;count--){
	System.out.print(myArray[count]+" ");
}
	}
}

	
		