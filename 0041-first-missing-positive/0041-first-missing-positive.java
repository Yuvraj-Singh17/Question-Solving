class Solution {
    public int firstMissingPositive(int[] arr) {
        Set<Integer> ans = new HashSet<>();
        for(int i : arr){
            if(i > 0){
                ans.add(i);
            }
        }
        int m = 1;
        while(ans.contains(m)){
            m++;
        }
        return m;
    }
}