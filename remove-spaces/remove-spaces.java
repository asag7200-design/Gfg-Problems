class Solution {
    public String removeSpaces(String s) {
        // code here
        int n = s.length();
 
StringBuilder s1 = new StringBuilder();
 
for (int i = 0; i<n; i++) {
 
if (s.charAt(i) == ' ') {
 
continue;
 
}
s1.append(s.charAt(i));
 
}
 
return s1.toString();

    }
}