import java.util.Scanner;
public class IT26102386Lab8Q3
{
	public static void main (String[]args)
	{
		Scanner input=new Scanner(System.in);
		int numbers[]= new int[6];
		int i;
		for(i=0;i<numbers.length;i++)
		{
			System.out.print("Enter a positive number "+"("+(i+1)+"/6):");
			numbers[i]=input.nextInt();
			if (numbers[i]<=0){
				System.out.println("Error:Please enter ONLY Positive numbers");
				i--;
				continue;
			}
		}
		int max = numbers[0];

        for(i = 1; i < numbers.length; i++)
        {
            if(numbers[i] > max)
            {
                max = numbers[i];
            }
        }

		// Print the array
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Array contents:");
		for ( i=0;i<numbers.length;i++)
		{
			System.out.print(numbers[i]+" ");
		}
		// display Max number
		System.out.println(" ");
		System.out.print(" The maximum number entered:"+max);
	}
}
				