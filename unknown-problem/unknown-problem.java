class Solution {
    public int firstSearch(int[] arr, int k) {
        // Code Here
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<k){
                low=mid+1;
            }else if(arr[mid]>k){
                high=mid-1;
            }else if(arr[mid]==k){
                if(mid>0&&arr[mid-1]==k){
                    high=mid-1;
                    continue;
                }
                return mid;
            }
        }
        return -1;
    }
}