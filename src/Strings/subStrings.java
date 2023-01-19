package Strings;

public class subStrings {
    public static String Substring(String Str, int si, int ei) {
        String subStr = "";
        for (int i = si; i < ei; i++) {
            subStr += Str.charAt(i);
        }
        return subStr;
    }

    public static void main(String[] args) {
        System.out.println(Substring("Faisal Farooq Dar", 7, 13));
    }

}
