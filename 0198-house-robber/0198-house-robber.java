class Solution {
    public int rob(int[] nums) {
        int[] arr = new int[101];
        Arrays.fill(arr , -1);
        int n = nums.length;
        return solve(nums , 0 , n , arr);
    }
    public static int solve(int[] nums, int i, int n , int[] arr){
        if(i >= n){
            return 0;
        }

        if(arr[i] != -1) return arr[i];

        int steal = nums[i] + solve(nums,  i+2 , n , arr);
        int skip = solve(nums, i+1 , n , arr);

        arr[i] = Math.max(steal , skip);
        return arr[i];
    }
}