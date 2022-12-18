public class Arrays {

    // Calculating Maxmimum Sum of an Aarray
    public static void PrintSumSubArrays(int arr[]) {

        int CurrSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i <= arr.length - 1; i++) {
            int start = i;
            for (int j = i + 1; j <= arr.length; j++) {
                int end = j;
                CurrSum = 0;
                for (int k = start; k < end; k++) {
                    CurrSum += arr[k];
                    System.out.print(arr[k] + " ");
                }
                System.out.println("Sum: " + CurrSum);
                if (maxSum < CurrSum) {
                    maxSum = CurrSum;
                }
            }
            System.out.println();
        }
        System.out.println("Max Sum is :" + maxSum);

    }

    // Calculating Maximum Sum Using Prefix of Array
    public static void PrefixSum(int arr[]) {
        int CurrSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i + 1; j < arr.length; j++) {
                int end = j;

                CurrSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (maxSum < CurrSum) {
                    maxSum = CurrSum;
                }
            }

        }
        System.out.println("Max Sum is :" + maxSum);

    }

    public static void main(String[] args) {

        int arr[] = { 2, 4, 6, 8, 10 };
        PrefixSum(arr);

    }

}
