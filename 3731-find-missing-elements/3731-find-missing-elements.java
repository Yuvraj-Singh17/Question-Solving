class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max = Arrays.stream(nums).max().getAsInt();
        int min = Arrays.stream(nums).min().getAsInt();

        List<Integer> arr = new ArrayList<>();

        Set<Integer> set = new HashSet<>();
        for(int i = 0 ; i < nums.length ; i++){
            set.add(nums[i]);
        }

        for(int i = min ; i < max ; i++){
            if(!set.contains(i+1)){
                arr.add(i+1);
            }
        }
        return arr;
    }
}