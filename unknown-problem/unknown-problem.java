class Solution {
    public int minJumps(int[] arr) {
        // code here
               int totaljumps=0;
       int n=arr.length-1;
       int coverage=0,jumpindex=0;
       if (arr.length==0) {
           return 0;
       }
       for(int i=0;i<arr.length;i++){
           coverage=Math.max(coverage, i+arr[i]);
           if (coverage <= i) {
               return -1;
           }
           if (i==jumpindex) {
               jumpindex=coverage;
               totaljumps++;
               if (coverage>=n) {
                   return totaljumps;

               }
           }

       }

       return totaljumps;
    }
}