public class index {

	public static int minDist(int arr[], int n, int x, int y) {
		int xIndex = -1;
		int yIndex = -1;

		int dist = Integer.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			if (arr[i] == x) {
				xIndex = i;
			} else if (arr[i] == y) {
				yIndex = i;
			}
			if (xIndex != -1 && yIndex != -1) {
				dist = Math.min(dist, Math.abs(xIndex - yIndex));
			}
		}
		return dist == Integer.MAX_VALUE ? -1 : dist;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 2 };
		int x = 1, y = 3;
		System.out.println(minDist(arr, arr.length, x, y));

	}
}
