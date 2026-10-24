class Solution {
    public int nCr(int n, int r) {
        // code here
      
if(n < r)return 0;
       else if(n == r || r == 0)return 1;
       double j = 1 ;
       double i = n ;
       double ans = 1;
       while(i > n-r){
            ans = ( (ans * i)/j);
           i--;
           j++;
       }
       return (int)(ans + 0.5);
}
    }
