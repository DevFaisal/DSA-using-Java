package Strings;

public class revString {
    // Reverse a String
    public static String revStr(String str) {
        String revStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            revStr += str.charAt(i);
        }
        return revStr;

    }

    public static void main(String[] args) {
        String name = "KhanSir";
        System.out.println(revStr(name));
    }
}
