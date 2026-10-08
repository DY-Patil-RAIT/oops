import java.util.Scanner;

class MatrixManipulator {

    public int[][] readMatrix(int rows, int cols) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix (" + rows + "x" + cols + "):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public void displayMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            System.out.println("Empty matrix");
            return;
        }
        System.out.println("Matrix:");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        if (matrix1 == null || matrix2 == null || matrix1.length == 0 || matrix2.length == 0) return null;
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] sumMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return sumMatrix;
    }

    public void printTransposedMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return;
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int j = 0; j < cols; j++) {
            for (int[] ints : matrix) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}

public class Exp_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MatrixManipulator manipulator = new MatrixManipulator();

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        System.out.println("\nInput Matrix 1:");
        int[][] matrix1 = manipulator.readMatrix(rows, cols);
        
        System.out.println("\nInput Matrix 2:");
        int[][] matrix2 = manipulator.readMatrix(rows, cols);

        int[][] sumMatrix = manipulator.addMatrices(matrix1, matrix2);
        
        System.out.println("\nSum Matrix:");
        manipulator.displayMatrix(sumMatrix);

        System.out.println("\nTransposed Sum Matrix:");
        manipulator.printTransposedMatrix(sumMatrix);
    }
}
