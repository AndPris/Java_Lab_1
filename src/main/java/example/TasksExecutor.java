package example;

public class TasksExecutor {
    public long[][] matrixXOR(long[][] A, long[][] B) {
        if(A.length != B.length || A[0].length != B[0].length)
            throw new IllegalArgumentException("A and B must have the same dimensions");

        long[][] C = new long[A.length][A[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                C[i][j] = A[i][j]^B[i][j];
            }
        }

        return C;
    }

    public long calculateMaxElementsSumInOddColumns(long[][] matrix) {
        long sum = 0;

        for (int i = 0; i < matrix[0].length; i++) {
            if(i % 2 == 0)
                continue;

            sum += findMaxElement(matrix, i);
        }

        return sum;
    }

    private long findMaxElement(long[][] matrix, int column) {
        long max = Long.MIN_VALUE;

        for (long[] row : matrix) {
            if (row[column] > max)
                max = row[column];
        }

        return max;
    }

    public long calculateMinElementsSumInEvenColumns(long[][] matrix) {
        long sum = 0;

        for (int i = 0; i < matrix[0].length; i++) {
            if(i % 2 == 1)
                continue;

            sum += findMinElement(matrix, i);
        }

        return sum;
    }

    private long findMinElement(long[][] matrix, int column) {
        long min = Long.MAX_VALUE;

        for (long[] row : matrix) {
            if (row[column] < min)
                min = row[column];
        }

        return min;
    }
}
