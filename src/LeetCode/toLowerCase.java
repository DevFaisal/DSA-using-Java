package LeetCode;
public class toLowerCase {
    public static String toLower(String str) {
        
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            sb.append(Character.toLowerCase(str.charAt(i)));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "FAISAL";
        System.out.println(toLower(str));
    }
}
