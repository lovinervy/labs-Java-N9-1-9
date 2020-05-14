public class main {
    public static void main(String[] args) {
        int tmp, x, y;
        int[][] matrix = {
                {7,   -2, -11,   3,  -5},
                {5,    2,   0,  10,   1},
                {-15,  9, -12,   8, -18},
                {0,  -10,   9, -13,   4},
                {-1, -17,   2,   4, -19}
        };

        int imin = 2;
        int jmin = 2;
        int imax = 4;
        int jmax = 4;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i < matrix.length - j - 1) {
                    if (matrix[imax][jmax] < matrix[i][j]) {
                        imax = i;
                        jmax = j;
                    }
                } else if (i > matrix.length - j - 1){
                    if (matrix[imin][jmin] > matrix[i][j]){
                        imin = i;
                        jmin = j;
                    }
                }
            }
        }

        x = imax + 1;
        y = jmax + 1;
        System.out.println("max:= " + matrix[imax][jmax] + " imax:= " + x + " jmax:= " + y);

        x = imin + 1;
        y = jmin + 1;
        System.out.println("min:= " + matrix[imin][jmin] + " imin:= " + x + " jmin:= " + y);
        tmp = matrix[imin][jmin];
        matrix[imin][jmin] = matrix[imax][jmax];
        matrix[imax][jmax] = tmp;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
