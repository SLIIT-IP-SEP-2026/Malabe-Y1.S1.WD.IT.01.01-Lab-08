import java.util.Scanner;
public class IT26102386Lab8Q1A
{
	public static void main(String[]args)
	{
		Scanner value=new Scanner(System.in);
		int myArray[]=new int[5];
		int i;
		for(i=0;i<myArray.length;i++)
		{
			System.out.print("Enter number "+(i+1)+":");
			myArray[i]=value.nextInt();
		}
		// print the array in reverse order
        System.out.println("");
		System.out.println("Array in reverse order:");
		for(i=4;i>=0;i--)
		{
			System.out.print(myArray[i]+" ");
		}
	}
}