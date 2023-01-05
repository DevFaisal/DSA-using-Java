package Conversion;

import java.util.Scanner;

// Decimal to Binary
public class decToBin {

    public static void main(String[] args) {

        System.out.print("Enter any Number : ");
        Scanner SC = new Scanner(System.in);
        int DecNum = SC.nextInt();
        int num = DecNum;
        int Pow = 0;
        int BinNum = 0;
        while (DecNum > 0) {

            int Rem = DecNum % 2;
            BinNum = BinNum + (Rem * (int) Math.pow(10, Pow));
            Pow++;
            DecNum = DecNum / 2;
        }
        System.out.println("Binary of Decimal Number " + num + " is " + BinNum);
    }

}
