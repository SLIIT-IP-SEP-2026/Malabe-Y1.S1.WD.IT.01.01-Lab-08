import java.util.Scanner;
public class IT26102386Lab8Q4
{
	public static void main(String[]args)
	{
		Scanner input= new Scanner(System.in); 
		int studentArray[]=new int[8];
		int i;
		for(i=0;i<studentArray.length;i++)
		{
			System.out.print("Enter Student ID for Student" +" "+(i+1)+":");
			studentArray[i]=input.nextInt();
			if (studentArray[i]<=0)
			{
				System.out.println("Error:Please enter ONLY Positive numbers");
				i--;
				continue;
			}
		}
		System.out.println(" ");
		System.out.print("Enter a Student ID to Search:");
		int n= input.nextInt();
		i=0;
		while(true){
			if(i == studentArray.length){
				System.out.println("Student is Not Available");
                break;
			}
			if(studentArray[i] == n){
				System.out.println("Student is Available");
				break;
			}
			i++;
		}
	}
}