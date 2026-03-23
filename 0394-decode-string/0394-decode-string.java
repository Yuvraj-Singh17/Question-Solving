class Solution {
    int i = 0;

    public String decodeString(String s) {
        StringBuilder res = new StringBuilder();
        int num = 0;

        while (i < s.length()) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            } 
            else if (ch == '[') {
                i++;
                String temp = decodeString(s);
                for (int j = 0; j < num; j++) {
                    res.append(temp);
                }
                num = 0;
            } 
            else if (ch == ']') {
                return res.toString();
            } 
            else {
                res.append(ch);
            }

            i++;
        }

        return res.toString();
    }
}