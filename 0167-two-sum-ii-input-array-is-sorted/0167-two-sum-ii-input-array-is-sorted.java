class Solution {
    public int[] twoSum(int[] arr, int target) {
        int l = 0;
        int r = arr.length-1;

        while(l < r){
            if(arr[r] + arr[l] == target){
                return new int[]{l+1,r+1};
            }
            if(arr[r] + arr[l] > target){
                r--;
            }else{
                l++;
            }
        }
        return new int[]{-1,-1};
    }
}