import java.util.Scanner;
	public class IT26102552Lab8Q1B{
		public static void main(String[] args){
			
			int myArray[] = new int[5];
			int evenArray[] = new int[5];
			
			Scanner input = new Scanner(System.in);
			
			
			System.out.println("Enter 5 Numbers:");
			
			for(int i = 0; i < 5; i++){
				System.out.print(" Enter Number " + (i + 1) +": ");
				myArray[i] = input.nextInt();
			}
			System.out.println("\n myArray content:");
			
			int j = 0;
			
			for (int i = 0; i < 5; i++) {
            if (myArray[i] % 2 == 0) {
                evenArray[j] = myArray[i];
                j++;
            }
        }
			
			for(int i = 4; i >= 0; i--)
				System.out.print(myArray[i] + " ");
			
			System.out.println("\n evenArray content:");
			
			
            for (int i = 0; i < 5; i++) {
            System.out.print(evenArray[i] + " ");
        }
			
			
		}
	}