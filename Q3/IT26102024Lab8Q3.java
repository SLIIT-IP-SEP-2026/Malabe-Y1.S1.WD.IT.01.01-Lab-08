import java.util.Scanner;

public class IT26102024Lab8Q3{
	public static void main (String[]args){

		int number, max;
		int count = 0;

		int[] numbers = new int[6];

		Scanner input = new Scanner(System.in);

		while (count < 6){

			System.out.print("Enter a Positive Number ("+(count+1)+"/6): ");
			number = input.nextInt();

			if (number <= 0){

				System.out.println("Error: Please Enter ONLY Positive Numbers");

			}else{

				numbers[count] = number;
				count++;

			}
		}

		max = numbers[0];

		for (int i = 1; i < 6; i++){
			if (numbers[i] > max){
				max = numbers[i];
			}
		}

		System.out.println();
		System.out.println("Array Contents:");

		for (int i = 0; i < 6; i++){
			System.out.print(numbers[i]+" ");
		}

		System.out.println();
		System.out.println("The Maximum Number Entered: "+max);

	}
}
