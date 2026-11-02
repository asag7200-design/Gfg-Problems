class Solution {
    public String booleanOperations(boolean a, boolean b) {
        // Code here
        boolean andResult = a && b;
        boolean orResult = a || b;
        boolean notA = !a;
        
        return andResult + " " + orResult + " " + notA;
    }
}