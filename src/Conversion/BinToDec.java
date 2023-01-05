package Conversion;

import java.util.Scanner;

//Binary to Decimal 
public class BinToDec {
    public static void main(String[] args) {

        System.out.print("Enter any Binary Number : ");
        try (Scanner sc = new Scanner(System.in)) {
            int binNum = sc.nextInt();
            int num = binNum;
            int pow = 0;
            int decNum = 0;
            while (binNum > 0) {
                int lastDigit = binNum % 10;
                decNum = decNum + (lastDigit * (int) Math.pow(2, pow));
                pow++;
                binNum = binNum / 10;
            }
            System.out.println("Decimal of Binary Number " + num + " is :" + decNum);
        }

    }
}
