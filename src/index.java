public class index {
    public static boolean isBinary(String str)
	{
	    boolean ans = false;
	    for(int i=0;i<str.length();i++){
	        if(str.charAt(i)=='1'|| str.charAt(i)=='0'){
	            ans = true;
	        }
	        else {
	            ans = false;
	        }
	    }
	    return ans;
	}

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 2, 1 };
        System.out.println(checkPalin(arr, arr.length));
    }
}
