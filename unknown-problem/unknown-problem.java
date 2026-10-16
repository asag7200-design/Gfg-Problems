class Solution {
    static int inSequence(int a, int b, int c) {
        // code here
    int n=a;
    int i=2;
    while(n<b){
    n=a+(i-1)*c;
    i++;
    }
    if(n==b) return 1;
    return 0; 

    }
}