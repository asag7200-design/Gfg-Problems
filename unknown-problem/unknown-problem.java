class Solution {
    public int sumOfMatrix(int[][] mat) {
        // code here
        
        int res = 0;
        
        for(int i = 0;i < mat.length;i++){
            
            for(int j = 0 ;j < mat[i].length;j++){
                
                res += mat[i][j];
            }
            
        }
        
        return res;
        
    }
}