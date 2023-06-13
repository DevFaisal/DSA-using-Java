import java.util.*;

public class index {

	public static int missingNumber(int A[], int N) {

		int sumOfArray = 0;

		for (int i = 0; i < A.length-1; i++) {
			sumOfArray += A[i];
		}
		int n = A.length;

		int expectedSum = (n * (n + 1)) / 2;

		return (expectedSum - sumOfArray);

	}

	public static void main(String[] args) {

		int arr[] = { 2, 5, 3, 1 };
		System.out.println(missingNumber(arr, arr.length));
	}
}