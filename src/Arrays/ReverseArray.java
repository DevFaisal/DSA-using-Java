package Arrays;

public class ReverseArray {

    // Reverse Fundtion
    public static void reverse(int arr[]) {

        int first = 0;
        int last = arr.length - 1;

        while (first < last) {
            // swap
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;
        }

    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6 };
        reverse(arr); // function call

        // print
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
