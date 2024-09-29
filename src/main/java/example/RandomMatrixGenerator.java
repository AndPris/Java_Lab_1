package example;

public class RandomMatrixGenerator {
    private static final long upperBound = 2000;

    public static long[][] generateRandomMatrix(int rows, int cols) {
        long[][] matrix = new long[rows][cols];

        for(int i = 0; i < rows; ++i) {
            for(int j = 0; j < cols; ++j) {
                matrix[i][j] = (long)(Math.random() * upperBound);
            }
        }

        return matrix;
    }
}
