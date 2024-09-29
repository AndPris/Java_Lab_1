package example;

/*
   Мій номер у списку групи - 18.
   С5 = 18 % 5 = 3
   С7 = 18 % 7 = 4
   С11 = 18 % 11 = 7
*/


public class Main {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 3;

        long[][] A = RandomMatrixGenerator.generateRandomMatrix(rows, cols);
        long[][] B = RandomMatrixGenerator.generateRandomMatrix(rows, cols);

        displayMatrix(A, "A");
        displayMatrix(B, "B");

        TasksExecutor tasksExecutor = new TasksExecutor();

        try {
            long[][] C = tasksExecutor.matrixXOR(A, B);
            displayMatrix(C, "C");

            long maxElementsSumInOddColumns = tasksExecutor.calculateMaxElementsSumInOddColumns(C);
            System.out.println("Sum of maximal elements in odd columns of matrix C: " + maxElementsSumInOddColumns);

            long minElementsSumInEvenColumns = tasksExecutor.calculateMinElementsSumInEvenColumns(C);
            System.out.println("Sum of minimal elements in even columns of matrix C: " + minElementsSumInEvenColumns);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void displayMatrix(long[][] matrix, String matrixName) {
        System.out.println(matrixName + ":");
        for (long[] row : matrix) {
            for (long element : row)
                System.out.printf("%5d", element);

            System.out.println();
        }

        System.out.println("\n==================================\n");
    }
}