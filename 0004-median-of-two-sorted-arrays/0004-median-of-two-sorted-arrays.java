class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> al = new ArrayList<>();

        for (int i : nums1) {
                al.add(i);
        }
        for (int i : nums2) {
                al.add(i);
        }
        Collections.sort(al);
        int n = al.size();
        if (al.size() % 2 != 0) {
            return al.get((n/2));
        }
        int sum = al.get(n/2) + al.get((n/2)-1);
        return sum / 2.0;

    }
}