class Solution {
    public int countNumbersWithUniqueDigits(int n) {

        if (n == 0)
            return 1;

        int ans = 10;
        int current = 9;
        int available = 9;

        for (int digits = 2; digits <= n && available > 0; digits++) {

            current = current * available;
            ans += current;

            available--;
        }

        return ans;
    }
}