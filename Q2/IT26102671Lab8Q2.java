public class IT26102671Lab8Q2 {

    public static void main(String[] args) {

        // Create arrays A and B
        int[] A = {10, 20, 30, 40, 50};
        int[] B = {34, 67, 12, 89, 12};

        // Create empty array C
        int[] C = new int[5];

        // Add corresponding elements of A and B and store in C
        for (int i = 0; i < C.length; i++) {
            C[i] = A[i] + B[i];
        }

        System.out.println("A Array Contents:");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }

        System.out.println("\n\nB Array Contents:");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }

        System.out.println("\n\nC Array Contents (A + B):");
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }
    }
}