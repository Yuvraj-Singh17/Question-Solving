public class Solution {
    public int LargestInteger(int[] nums, int k) {
        Dictionary<int, int> count = new Dictionary<int, int>();

        for (int i = 0; i <= nums.Length - k; i++) {
            HashSet<int> set = new HashSet<int>();

            for (int j = i; j < i + k; j++) {
                set.Add(nums[j]);
            }

            foreach (int x in set) {
                if (!count.ContainsKey(x))
                    count[x] = 0;

                count[x]++;
            }
        }

        int ans = -1;

        foreach (var p in count) {
            if (p.Value == 1)
                ans = Math.Max(ans, p.Key);
        }

        return ans;
    }
}