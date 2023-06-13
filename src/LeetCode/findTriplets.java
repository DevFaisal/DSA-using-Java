package LeetCode;

import java.util.*;

public class findTriplets {

    public static boolean findTriplet(int arr[], int n) {

        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            int l = i + 1;
            int r = n - 1;
            while (l < r) {
                int sum = arr[i] + arr[l] + arr[r];
                if (sum == 0)
                    return true;
                else if (sum > 0)
                    r--;
                else
                    l++;

            }

        }

        return false;
    }

    public static void main(String[] args) {

    }
}