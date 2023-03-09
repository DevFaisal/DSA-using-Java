package LeetCode;

public class removeDuplicate {

    public static int removeDuplicate(int nums[]) {
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                nums[j + 1] = nums[i];
                j++;
            }
        }
        return j + 1;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 0, 0, 0, 1, 1, 1, 2, 2, 2, 2 };
        removeDuplicate(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i]);
        }

    }
}
