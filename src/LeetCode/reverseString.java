package LeetCode;

public class reverseString {
    public static String revString(String str) {

        StringBuilder sc = new StringBuilder("");
        char words[] = str.toCharArray();
        for (int i = str.length() - 1; i >= 0; i--) {
            sc.append(words[i]);
        }

        return sc.toString();

    }

    public static void main(String[] args) {

    }
}
