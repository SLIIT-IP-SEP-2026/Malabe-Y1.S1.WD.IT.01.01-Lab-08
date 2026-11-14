import java.util.Scanner;

public class IT26102095Lab8Q1A {
    public static void main(String[] args) {
		
		int number[]=new int[5];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 5numbers");
		
		for (int i=0;i<5;i++){
			System.out.print("Enter Number"+(i+1)+":");
			number[i]=input.nextInt();
		}
		System.out.println("\nArray in reverse Order: ");
		for (int i=4; i>=0;i--){
			System.out.print(number[i]+" ");
		}
	}
}