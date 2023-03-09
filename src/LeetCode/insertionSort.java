package LeetCode;

public class insertionSort {

    public static int[] inSort(int arr[]) {

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                // swap
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;

    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 2, 4, 1 };
        inSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
