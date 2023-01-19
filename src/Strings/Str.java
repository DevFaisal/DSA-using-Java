package Strings;

public class Str {

    public static String toUpperCase(String Str) {

        String upperCase = "";
        for (int i = 0; i < Str.length(); i++) {
            if (Str.charAt(i) >= 'a' && Str.charAt(i) <= 'z') {
                // upperCase = Str.charAt(i) - (String) (32);
            }
            System.out.println(upperCase);
        }
        return upperCase;
    }

    }

    public static String Compression(String str) {

        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            Integer count = 0;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newStr.append(str.charAt(i));
            if (count > 1) {
                newStr.append(count.toString());
            }
        }
        return newStr.toString();
    }

    public static void main(String[] args) {

    }
}
