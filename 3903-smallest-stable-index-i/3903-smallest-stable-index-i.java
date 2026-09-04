class Solution {
    public int minIn(int[] nums, int l , int r){
        int min = Integer.MAX_VALUE;
        for(int i = l ; i <= r ; i++){
            if(nums[i] < min){
                min = nums[i];
            }
        }
        return min;
    }
    public int maxIn(int[] nums , int l , int r){
        int max = Integer.MIN_VALUE;
        for(int i = l ; i <= r ; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }
    public int firstStableIndex(int[] nums, int k) {
        int minIndex = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length ; i++){
            int max = maxIn(nums , 0 , i);
            int min = minIn(nums , i , nums.length - 1);

            int ans = max - min;

            if(ans <= k){
                minIndex = Math.min( i , minIndex);
            }
        }
        if(minIndex == Integer.MAX_VALUE){
            return -1;
        }
        return minIndex;
    }
}