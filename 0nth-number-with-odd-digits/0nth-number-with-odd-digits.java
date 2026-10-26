class Solution {
    public int findNumber(int n) {
        // code here
        char[] odd = {'1', '3', '5', '7', '9'};
                StringBuilder sb = new StringBuilder();

                while (n > 0) {
                    int rem = (n - 1) % 5;
                    sb.append(odd[rem]);
                    n = (n - 1) / 5;
                }

                return Integer.parseInt(sb.reverse().toString());
    }
}