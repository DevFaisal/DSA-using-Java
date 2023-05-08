package LeetCode;

public class missingNumber {

    public static int missingNo(int array[], int n) {

        int sumArr = 0;
        for (int i = 0; i < n - 1; i++) {
            sumArr += array[i];
        }
        // Maths formula to calculate sum from 1 to n
        int exptSum = (n * (n + 1) / 2);

        return exptSum - sumArr;
    }

    public static void main(String[] args) {

        int arr[] = { 6, 1, 2, 8, 3, 4, 7, 10, 5 };
        int n = 10;
        System.out.println(missingNo(arr, n));

    }

}
