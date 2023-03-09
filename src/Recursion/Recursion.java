package Recursion;

public class Recursion {

    public static void printDec(int n) {
        // Base Case
        if (n == 1) {
            System.out.println(1);
            return;
        }
        printDec(n - 1);
        System.out.println(n);
    }

    public static int CalSum(int n) {
        if (n == 1) {
            return 1;
        }
        int Sum1 = CalSum(n - 1);
        int Sn = n + Sum1;
        return Sn;
    }

    public static int Fibo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fnm1 = Fibo(n - 1);
        int fnm2 = Fibo(n - 2);
        int Fib = +fnm1 + fnm2;
        return Fib;
    }

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    public static int lastOccurance(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurance(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    public static void printNum(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNum(n - 1);
    }

    public static void main(String[] args) {
       printNum(5);
    }
}
