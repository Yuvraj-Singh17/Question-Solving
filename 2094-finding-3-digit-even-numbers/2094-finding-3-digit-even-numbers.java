class Solution {
    public int[] findEvenNumbers(int[] digits) {
        ArrayList<Integer> list = new ArrayList<>();
        boolean[] used = new boolean[digits.length];

        solve(digits, used, 0, 0, list);

        HashSet<Integer> set = new HashSet<>(list);
        ArrayList<Integer> ans = new ArrayList<>(set);
        Collections.sort(ans);

        int[] res = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }
        return res;
    }

    public void solve(int[] digits, boolean[] used, int count, int num, ArrayList<Integer> list) {

        if (count == 3) {
            if (num % 2 == 0) {
                list.add(num);
            }
            return;
        }

        for (int i = 0; i < digits.length; i++) {

            if (used[i]) continue;
            if (count == 0 && digits[i] == 0) continue;

            used[i] = true;

            solve(digits, used, count + 1, num * 10 + digits[i], list);

            used[i] = false;
        }
    }
}