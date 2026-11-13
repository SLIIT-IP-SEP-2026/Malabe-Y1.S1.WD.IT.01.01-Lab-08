public class IT26101970Lab8Q2{

    public static void main(String [] args){

        // Initializing the Array
        int[] A = {10, 20, 30, 40, 50};
        int[] B = {34, 67, 12, 89, 12};
        int[] C = new int[5];

        // Getting the array C
        for (int count = 0; A.length > count; count++){
            C[count] = A[count] + B[count];
        }

        // Printing the array A
        System.out.println("\nA Array Contents: ");
        for (int count = 0; A.length > count; count++){
            System.out.print(A[count] + " ");
        }
        System.out.println();

        // Printing the array B
        System.out.println("\nB Array Contents: ");
        for (int count = 0; B.length > count; count++){
            System.out.print(B[count] + " ");
        }
        System.out.println();

        // Printing the array C
        System.out.println("\nC Array Contents: ");
        for (int count = 0; C.length > count; count++){
            System.out.print(C[count] + " ");
        }
        System.out.println();

    }
}