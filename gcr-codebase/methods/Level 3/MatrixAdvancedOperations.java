public class MatrixAdvancedOperations {

    // Method to create random matrix
    static double[][] createMatrix(int rows, int cols) {
        double[][] m = new double[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                m[i][j] = 1 + (int)(Math.random() * 9);
        return m;
    }

    // Method to display matrix
    static void displayMatrix(double[][] m) {
        for (double[] row : m) {
            for (double val : row)
                System.out.printf("%6.2f ", val);
            System.out.println();
        }
    }

    // Method to find transpose
    static double[][] transpose(double[][] m) {
        double[][] t = new double[m[0].length][m.length];
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[0].length; j++)
                t[j][i] = m[i][j];
        return t;
    }

    // Determinant of 2x2 matrix
    static double determinant2x2(double[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }

    // Determinant of 3x3 matrix
    static double determinant3x3(double[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
             - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
             + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    // Inverse of 2x2 matrix
    static double[][] inverse2x2(double[][] m) {
        double det = determinant2x2(m);
        if (det == 0) return null;

        return new double[][]{
                { m[1][1] / det, -m[0][1] / det },
                { -m[1][0] / det, m[0][0] / det }
        };
    }

    // Inverse of 3x3 matrix
    static double[][] inverse3x3(double[][] m) {
        double det = determinant3x3(m);
        if (det == 0) return null;

        double[][] inv = new double[3][3];

        inv[0][0] =  (m[1][1]*m[2][2] - m[1][2]*m[2][1]) / det;
        inv[0][1] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]) / det;
        inv[0][2] =  (m[0][1]*m[1][2] - m[0][2]*m[1][1]) / det;

        inv[1][0] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]) / det;
        inv[1][1] =  (m[0][0]*m[2][2] - m[0][2]*m[2][0]) / det;
        inv[1][2] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]) / det;

        inv[2][0] =  (m[1][0]*m[2][1] - m[1][1]*m[2][0]) / det;
        inv[2][1] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]) / det;
        inv[2][2] =  (m[0][0]*m[1][1] - m[0][1]*m[1][0]) / det;

        return inv;
    }

    // Main method
    public static void main(String[] args) {

        // 2x2 Matrix
        double[][] m2 = createMatrix(2, 2);
        System.out.println("2x2 Matrix:");
        displayMatrix(m2);

        System.out.println("\nTranspose:");
        displayMatrix(transpose(m2));

        System.out.println("\nDeterminant: " + determinant2x2(m2));

        System.out.println("\nInverse:");
        double[][] inv2 = inverse2x2(m2);
        if (inv2 != null) displayMatrix(inv2);
        else System.out.println("Inverse not possible");

        // 3x3 Matrix
        double[][] m3 = createMatrix(3, 3);
        System.out.println("\n3x3 Matrix:");
        displayMatrix(m3);

        System.out.println("\nTranspose:");
        displayMatrix(transpose(m3));

        System.out.println("\nDeterminant: " + determinant3x3(m3));

        System.out.println("\nInverse:");
        double[][] inv3 = inverse3x3(m3);
        if (inv3 != null) displayMatrix(inv3);
        else System.out.println("Inverse not possible");
    }
}
