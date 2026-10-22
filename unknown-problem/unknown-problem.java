class Solution {
    public int countDigits(int n) {
        // Code here
                if (n == 0) return 1;
        n = Math.abs(n);
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }
}