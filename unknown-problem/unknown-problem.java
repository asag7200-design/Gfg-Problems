class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
                char ch[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch2);
      String result1 = new String(ch);
      String result2 = new String(ch2);
      if(result1.equals(result2)){
          return true;
      }
      return false;
    }
}