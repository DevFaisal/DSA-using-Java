package SearchSort;

public class SearchingAlgorithms {

    public static int BinarySearch(int arr[], int key) {

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = { 9, 12, 13, 24, 35, 46, 57 };
        int key = 9;
        System.out.println("Found at index :" + BinarySearch(arr, key));

    }
}
