class Solution {
    public int searchInsert(int[] arr, int target) {
        return helper(arr , target , 0 , arr.length-1);
    }
    public int helper(int[] arr , int x , int low , int high){
        if(low > high){
            return low;
        }
        int mid = low + (high-low)/2;

        if(arr[mid] == x){
            return mid;
        }
        if(arr[mid] > x){
            return helper(arr , x , low , mid-1);
        }else{
            return helper(arr , x , mid + 1 , high);
        }
    }
}