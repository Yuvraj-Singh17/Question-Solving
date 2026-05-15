class Solution {
    public int findMin(int[] nums) {
        int min = Arrays.stream(nums).min().getAsInt();
        return min;
    }
}