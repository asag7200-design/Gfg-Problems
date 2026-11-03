class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here     
        ArrayList<Integer> result = new ArrayList<Integer>();
          int leader = arr[arr.length - 1];

            result.add(leader);

            for (int i = arr.length - 2; i >= 0; i--) {
                if (arr[i] >= leader) {
                    leader = arr[i];
                    result.add(leader);
                }
            }

            reverseArray(result);

            return result;
        }

        private static void reverseArray(ArrayList<Integer> arr) {
            int start = 0;
            int end = arr.size() - 1;

            while (start < end) {   
                int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);

            start++;
            end--;
        }
    }
}
