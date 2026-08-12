class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int l = 0;
        int r = 0;
        int maxlen = 0;

        Map<Integer , Integer> map = new HashMap<>();

        while(r < nums.length){
            map.put(nums[r] , map.getOrDefault(nums[r],0)+1);
            while(map.get(nums[r]) > k){
                map.put(nums[l] , map.get(nums[l])-1);
                if(map.get(nums[l]) == 0){
                    map.remove(nums[l]);
                }
                l++;
            }
            maxlen = Math.max(r-l+1 , maxlen);
            r++;
        }
        return maxlen;
    }
}