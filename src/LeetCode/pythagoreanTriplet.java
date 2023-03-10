package LeetCode;

import java.util.Arrays;

public class pythagoreanTriplet {
    public static boolean pyTriplet(int arr[]) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {

                    int a = arr[i];
                    int b = arr[j];
                    int c = arr[k];

                    if ((a * a + b * b) == c * c) {
                        return true;
                    }
                }
            }
        }
        return false;

    }

    public static void main(String[] args) {

        int arr[] = { 3, 8, 5 };
        System.out.println(pyTriplet(arr));

    }
}
