class Solution {
    public int rob(int[] nums) {
        int[] arr = new int[nums.length+1];
        Arrays.fill(arr , 0);
        int n = nums.length;

        arr[0] = 0;
        arr[1] = nums[0];
        
        for(int i = 2 ; i <= n ; i++){
            int steal = nums[i-1] + arr[i-2];
            int skip = arr[i-1];

            arr[i] = Math.max(steal , skip);
        }
        return arr[n];
    }
}