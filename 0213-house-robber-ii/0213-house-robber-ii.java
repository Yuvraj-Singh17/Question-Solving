class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        if(n == 2) return Math.max(nums[0],nums[1]);

        int[] arr = new int[101];
        Arrays.fill(arr , -1);

        // taking 0th house
        int t0 = solve(nums , 0 , n-2 , arr);

        Arrays.fill(arr , -1);
        //take 1st index house
        int t1 = solve(nums , 1 , n-1 , arr);

        return Math.max(t1 , t0);

    }
    public static int solve(int[] nums , int i , int n ,int[] arr){
        if(i > n) return 0;
        if(arr[i] != -1){
            return arr[i];
        }

        int steal = nums[i] + solve(nums , i+2 , n , arr);
        int skip = solve(nums , i+1 , n , arr);

        arr[i] = Math.max(steal , skip);

        return arr[i];
    }
} 