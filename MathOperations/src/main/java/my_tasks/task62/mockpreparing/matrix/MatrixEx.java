package my_tasks.task62.mockpreparing.matrix;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Random;

public class MatrixEx {
    public static int[][] createMatrix(int n) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        while (linkedHashSet.size() != n - 1)
            linkedHashSet.add(new Random().nextInt(1, n));

        int[][] matrix = new int[3][3];
        int index = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = linkedHashSet.removeFirst();
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        System.out.println("Arrays.deepToString(createMatrix(15)) = " + Arrays.deepToString(createMatrix(15)));
    }
}
