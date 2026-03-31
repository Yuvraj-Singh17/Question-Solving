class Solution {
    public int rob(int[] nums) {
        
        int n = nums.length;

        int a = 0;
        int b = nums[0];
        
        for(int i = 2 ; i <= n ; i++){
            int steal = nums[i-1] + a;
            int skip = b;

            a = b;
            b = Math.max(steal , skip);
        }
        return b;
    }
}