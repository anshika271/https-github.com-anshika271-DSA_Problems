import java.util.*;

class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {

        int n = nums1.length;
        int[] diff = new int[n];

        long p = (long) k1 + k2;
        long total = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs(nums1[i] - nums2[i]);
            total += diff[i];
            max = Math.max(max, diff[i]);
        }

        if (total <= p) return 0;

        int low = 0, high = max;

        while (low < high) {
            int mid = low + (high - low) / 2;
            long count = 0;

            for (int a : diff) {
                if (a > mid) {
                    count += a - mid;
                }
            }

            if (count <= p) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        long sum = 0;

        for (int a : diff) {
            if (a > low) {
                p -= a - low;
                a = low;
            }

            sum += (long) a * a;
        }

        sum -= p * (2L * low - 1);

        return sum;
    }
}