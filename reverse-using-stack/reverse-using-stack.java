class Solution {
    public String reverse(String S) {
        java.util.Stack<Character> st = new java.util.Stack<>();

        for(int i = 0; i < S.length(); i++) {
            st.push(S.charAt(i));
        }

        StringBuilder sb = new StringBuilder();

        while(!st.isEmpty()) {
            sb.append(st.pop());
        }

        return sb.toString();
    }
}