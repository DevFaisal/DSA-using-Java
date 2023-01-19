package Strings;

public class checkBin {
    public static boolean isBinary(String str) {
        boolean ans = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > '1') {
                ans = false;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String number = "110101";
        System.out.println(isBinary(number) ? "Yes it is" : "No it is not");
    }
}
