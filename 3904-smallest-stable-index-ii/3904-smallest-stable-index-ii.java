class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int maxSoFar = -1;
        int c = 0, max = 0;

        for (int i = 0; i < nums.length; i++) {
            maxSoFar = Math.max(maxSoFar, nums[i]);

            if (i == c) max = maxSoFar;

            if (nums[i] < max - k)
                c = i + 1;
        }

        return c < nums.length ? c : -1;
    }
}