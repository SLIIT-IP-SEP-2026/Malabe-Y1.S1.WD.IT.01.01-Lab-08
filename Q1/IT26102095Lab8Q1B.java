import java.util.Scanner;

public class IT26102095Lab8Q1B {
    public static void main(String[] args) {
		int number[]=new int[5];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 5numbers");
	for(int i=0;i<5;i++){
		System.out.print("Enter Number"+(i+1)+":");
		number[i]=input.nextInt();
	}
	System.out.println("myArray Contents: ");
	for(int i=0;i<5;i++){
		System.out.print(number[i]+" ");
	}
	System.out.println(" ");
	System.out.println("evenArray Contents: ");
	for(int i=0;i<5;i++){
		if(number[i]%2==0){
			System.out.print(number[i]+" ");
		}
	}
	}
	}

			
		