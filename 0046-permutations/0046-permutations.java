class Solution {
    public List<List<Integer>> permute(int[] arr) {
         List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean[] vis = new boolean[arr.length];
        permute(arr , ans , temp , vis);
        return ans;
    }

    public static void permute(int[] arr ,List<List<Integer>> ans,List<Integer> temp, boolean[] vis){
        if(arr.length == temp.size()){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i = 0 ; i < arr.length ; i++){
            if(vis[i] == false){
                vis[i] = true;
                temp.add(arr[i]);
                permute(arr , ans , temp , vis);
                vis[i] = false;
                temp.remove(temp.size() - 1);
            }
        }
    }
}