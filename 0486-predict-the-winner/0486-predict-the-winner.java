class Solution {
    public boolean predictTheWinner(int[] nums) {
        
        int n = nums.length;

        return helper(nums, 0 , n-1) >= 0;
    }
    public static int helper(int[] nums , int i , int j){
        if(i > j){
            return 0;
        }
        if(i == j){
            return nums[i];
        }
        int take_i = nums[i] - helper(nums, i+1 , j);

        int take_j = nums[j] - helper(nums , i , j-1);

        return Math.max(take_i , take_j);
    }
}