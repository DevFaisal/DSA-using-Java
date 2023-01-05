public class Index {

    public static boolean isPalindrome(int x) {

        int number = 0;
        int temp = x;
        while (x > 0) {
            int rem = x % 2;
            number = (number * 10) + rem;
            x = x / 10;

        }
        if (number == temp) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        boolean ans = isPalindrome(113);
        if (ans) {
            System.out.println("YES");
        } else {
            System.out.println("False");
        }
    }
}
