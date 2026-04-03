class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if(n == 1) return nums[0];

        int[] t = new int[n+1];

        t[0] = 0;

        for(int i = 1 ; i <= n-1 ; i++){
            int skip = t[i-1];
            int take = nums[i-1] + (i-2 >= 0 ? t[i-2]:0);
            t[i] = Math.max(skip , take);
        }
        int res1 = t[n-1];

        Arrays.fill(t , 0);

        t[0] = 0;
        for(int i = 2 ; i <= n ; i++){
            int skip = t[i-1];
            int take = nums[i-1] + (i-2 >= 0 ? t[i-2]:0);
            t[i] = Math.max(skip , take);
        }
        int res2 = t[n];
        return Math.max(res1 , res2);
    }
} 