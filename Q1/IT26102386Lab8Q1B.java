import java.util.Scanner;
public class IT26102386Lab8Q1B
{
	public static void main(String[]args)
	{
		Scanner value=new Scanner(System.in);
		int myArray[]=new int[5];
		int i;
		int evenArray[]=new int[5];
		int j=0;
		for(i=0;i<myArray.length;i++)
		{
			System.out.print("Enter number "+(i+1)+":");
			myArray[i]=value.nextInt();
		}
		System.out.println(" ");
		System.out.println("myArray Contents:");
		for(i=0;i<myArray.length;i++)
		{
			System.out.print(myArray[i]+" ");
		}
		//find even array
		
		 for( i = 0; i < myArray.length; i++)
        {
            if(myArray[i] % 2 == 0)
            {
                evenArray[j] = myArray[i];
                j++;
            }
        }
		//print even array
		System.out.println(" ");
		System.out.println("evenArray Contents:");
		  for( i = 0; i < j; i++)
        {
            System.out.print(evenArray[i] + " ");
		}
	}
}
		
		