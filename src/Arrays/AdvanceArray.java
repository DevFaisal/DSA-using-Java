package Arrays;

public class AdvanceArray {

    public static void SpiralMatrxi(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;

        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // Top
            for (int j = startCol; j < -endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }
            // Right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            // Bottom
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }
            // left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();

    }

    // Greatest Element in a Matrix
    public static void GreatesElementInMatrics(int matrix[][]) {
        int maxElement = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
                if (matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("Greatest element in Matrics is :" + maxElement);
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        SpiralMatrxi(matrix);
    }

}
