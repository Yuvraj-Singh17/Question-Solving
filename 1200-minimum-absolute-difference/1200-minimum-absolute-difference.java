class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;
        List<List<Integer>> map = new ArrayList<>();

        for(int i = 0 ; i < arr.length-1 ; i++){
            minDiff = Math.min(minDiff , Math.abs(arr[i] - arr[i + 1]));
        }
        System.out.println(minDiff);
        for(int i = 0 ; i < arr.length-1 ; i++){
            List<Integer> temp = new ArrayList<>();
            if(minDiff == Math.abs(arr[i] - arr[i + 1])){
                int a = arr[i];
                int b = arr[i + 1];
                temp.add(a);
                temp.add(b);
                map.add(temp);
            }
            temp.remove(temp);
        }

        return map;
    }
}