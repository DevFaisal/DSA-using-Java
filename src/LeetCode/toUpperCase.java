package LeetCode;

public class toUpperCase {
    public static String toUpper(String str) {

        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            sb.append(Character.toUpperCase(str.charAt(i)));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String name = "geeksforgeeks";
        System.out.println(toUpper(name));
    }
}
