class Solution {
    public int maximumLengthSubstring(String s) {
        int l = 0;
        int r = 0;

        Map<Character , Integer> map = new HashMap<>();
        int max = 0;

        while(r < s.length()){
            char c = s.charAt(r);
            map.put(s.charAt(r) , map.getOrDefault(s.charAt(r) , 0)+1);

            while (map.get(c) > 2) {
                char ch = s.charAt(l++);
                map.put(ch, map.get(ch) - 1);
            }

            max = Math.max(max, r - l + 1);
            r++;

        }
        return max;

    }
}