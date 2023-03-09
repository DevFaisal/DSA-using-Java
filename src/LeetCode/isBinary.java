package LeetCode;

public class isBinary {
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
        String str = "100010110";
        System.out.println(isBinary(str));
    }
}
