package Strings;

public class remSpaces {
    public static String removeSpace(String S) {
        String str = "";

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (ch != ' ') {
                str += ch;
            }
        }
        return str;
    }

    public static void main(String[] args) {
        String name = "F a i s a l";
        System.out.println(removeSpace(name));
    }

}
