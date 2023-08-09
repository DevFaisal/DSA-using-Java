import java.util.*;

public class index {

	public static void main(String[] args) {

		int nums[] = new int[] { 0, 1, 2, 2, 3, 0, 4, 2 };

		int val = 2;

		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[count] = nums[i];
				count++;
			}
		}
	}
}
