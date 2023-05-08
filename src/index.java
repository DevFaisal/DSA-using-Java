import java.util.*;

public class index {

	public static int missingNumber(int array[], int n) {
		
		int sumArr = 0;
		for (int i = 0; i < n - 1; i++) {
			sumArr += array[i];
		}
		int exptSum = (n * (n + 1) / 2);

		return exptSum-sumArr;
	}

	public static void main(String[] args) {

		int arr[] = { 6, 1, 2, 8, 3, 4, 7, 10, 5 };
		int n = 10;
		System.out.println(missingNumber(arr, n));

	}
}