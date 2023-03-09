package LeetCode;

public class minDistance {
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

}
