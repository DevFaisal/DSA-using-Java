import java.util.Scanner;

import javax.xml.transform.Source;

public class AdvanceArray {

    public static void Matrics(int matrix[][]) {
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
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
                { 10, 11, 12 }
        };
        System.out.println(matrix[0][0]);
        System.out.println(matrix[0].length - 1);
    }

}
