public class Patterns {

    // Hollow Rectangele
    public static void HollowRectangel(int Rows, int Columns) {

        for (int i = 1; i <= Rows; i++) {

            for (int j = 1; j <= Columns; j++) {
                if (i == 1 || i == Rows || j == 1 || j == Columns) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Inverted Half Pyramid with Numbers
    public static void InvertedHalfPyramidWithNumbers(int Rows) {

        for (int i = 1; i <= Rows; i++) {
            for (int j = 1; j <= Rows - i; j++) {
                System.out.print(j);
            }
            System.out.println();

        }

    }

    // 1,0 Traingle
    public static void Traingle(int Rows) {
        for (int i = 1; i <= Rows; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    // Floyd's Traingle
    public static void FloydsTriangle(int Rows) {
        int counter = 1;
        for (int i = 1; i <= Rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    // Inverted Rotated Half Pyramid
    public static void InvertedRotatedHalfPyramid(int Rows) {

        for (int i = 1; i <= Rows; i++) {

            // Printing Spaces
            for (int j = 1; j <= Rows - i; j++) {
                System.out.print(" ");
            }
            // Printing Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }

    // Solid Rhombos
    public static void SolidRhombos(int n) {

        for (int i = 1; i < n; i++) {

            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    // Hollow Rhombos
    public static void HollowRhombos(int n) {

        for (int i = 1; i <= n; i++) {

            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Stars
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    // Butterfly Pattern
    public static void Butterfly(int Rows) {

        // Upper Side
        for (int i = 1; i <= Rows; i++) {
            // Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces as the difference between is Even number
            for (int j = 1; j <= 2 * (Rows - i); j++) {
                System.out.print(" ");
            }
            // Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        // Lower Side
        for (int i = Rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 2 * (Rows - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {

        HollowRhombos(10);

    }
}