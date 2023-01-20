package BitManipulation;

public class BitwiseOperators {

    // Check if the number is evenOrOdd
    public static void ifOddOrEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            // even number
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {
        System.out.println(1 & 3); // AND Opeator (001 & 011 = 001) - both bits should 1 then output is 1
        System.out.println(1 | 3);// OR Operator (001 OR 011 = 011) - if one bit is 1 then output is 1
        System.out.println(1 ^ 3); // XOR Operator (001 XOR 011 = 010) - same bits gives 0 , alternate gives 1

        // 1's Complement
        System.out.println(~5); // it inverse the bits
        System.out.println(5 << 2); // 000101 << 2 - 010100(20)
        System.out.println(5 >> 2); // 000101 >> 2 - 000001(1)

        ifOddOrEven(1);
        ifOddOrEven(2);

    }
}
