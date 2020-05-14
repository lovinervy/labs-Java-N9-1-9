public class main {
    public static int[] summ(int[][] matrix){
        int right_sum = 0;
        int left_sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i < j & i > matrix.length - j - 1){
                    right_sum = right_sum + matrix[i][j];
                } else if (i > j & i < matrix.length - j - 1){
                    System.out.println(matrix[i][j]);
                    left_sum = left_sum + matrix[i][j];
                }
            }
        }
        int[] res = {left_sum, right_sum};
        return res;
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {7,   -2, -11,   3,  -5},
                {5,    2,   0,  10,   1},
                {-15,  9, -12,   8, -18},
                {0,  -10,   9, -13,   4},
                {-1, -17,   2,   4, -19}
        };

        int[] result = main.summ(matrix);
        System.out.println("Левая часть := " + result[0] + "\nПравая часть := " + result[1]);

    }
}
