public class IT26102386Lab8Q2
{
	public static void main (String[]args)
	{
		int A[]={10, 20, 30, 40, 50};
		int B[]={ 34, 67, 12, 89, 12};
		int C[]=new int[5];
		//Add array A and B
		for(int i = 0; i < A.length; i++)
		{
			C[i] = A[i] + B[i];
		}
		//Dispaly Array A
		System.out.println(" ");
		System.out.println("A array contents:");
		for (int i=0;i<A.length;i++)
		{
			System.out.print(A[i]+" ");
		}
		//Display Array B
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("B array contents:");
		for (int i=0;i<B.length;i++)
		{
			System.out.print(B[i]+" ");
		}
		//Display Array C
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("C array contents (A+B):");
		for (int i=0;i<C.length;i++)
		{
			System.out.print(C[i]+" ");
		}
	}
}
		