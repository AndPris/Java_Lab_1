import example.TasksExecutor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TasksExecutorTests {
    private final TasksExecutor executor = new TasksExecutor();

    private final long[][] A = {{1, 2},
                                {3, 4}};

    private final long[][] B = {{2, 3},
                                {4, 5}};

    private final long[][] XORExpectedResult = {{3, 1},
                                        {7, 1}};

    @Test
    void matrixXORTest1() {
        long[][] C = executor.matrixXOR(A, B);

        for(int i = 0; i < C.length; i++)
            assertArrayEquals(XORExpectedResult[i], C[i]);
    }

    @Test
    void matrixXORTest2() {
        long[][] D = {{1}, {2}};
        assertThrows(IllegalArgumentException.class, () -> executor.matrixXOR(A, D));

    }

    @Test
    void calculateMaxElementsSumInOddColumnsTest() {
        assertEquals(4, executor.calculateMaxElementsSumInOddColumns(A));
        assertEquals(5, executor.calculateMaxElementsSumInOddColumns(B));
    }

    @Test
    void calculateMinElementsSumInEvenColumnsTest() {
        assertEquals(1, executor.calculateMinElementsSumInEvenColumns(A));
        assertEquals(2, executor.calculateMinElementsSumInEvenColumns(B));
    }
}
