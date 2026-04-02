class Solution {
    public String convert(String s, int numRow) {
        if (numRow == 1) return s;
        
        String arr[] = new String[numRow];
        Arrays.fill(arr, "");
        int i = 0;
        
        while (i < s.length()) {
            for (int index = 0; index < numRow && i < s.length(); index++) {
                arr[index] += s.charAt(i++);
            }
            for (int index = numRow - 2; index >= 1 && i < s.length(); index--) {
                arr[index] += s.charAt(i++);
            }
        }
        String res = "";
        for (String st : arr) {
            res+=st;
        }
        return res;
    }
}
