import java.lang.annotation.IncompleteAnnotationException;
import java.util.ArrayList;

public class main {
    public  static int[][] gen(int[][] matrix1, int[][] matrix2){
        if (matrix1[0].length != matrix2.length) {
            throw new NullPointerException("Невозможно умножить, такие матрицы");
        } else {
            int[][] mas = new int[matrix1.length][matrix2[0].length];
            for (int i = 0; i < matrix1.length; i++) {
                for (int j = 0; j < matrix2[0].length; j++) {
                    for (int k = 0; k < matrix1[0].length; k++) {
                        mas[i][j] += matrix1[i][k] * matrix2[k][j];
                    }

                }

            }
            return mas;
        }
    }
    public static void main(String[] args) {
        int[][] matrix1 = {
                {2, 3, 3},
                {4, 1, 4}

        };
        int [][] matrix2 = {
                {1, 3},
                {3, 4},
                {4, 5}
        };

        int [][] result = main.gen(matrix1, matrix2);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.format("%6d", result[i][j]);
            }
            System.out.println();

        }
    }
}
