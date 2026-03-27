class Solution {
    public boolean isValid(String str) {
        ArrayDeque<Character> stack = new ArrayDeque<>();

        for(int i = 0;  i < str.length() ; i++){
            char s = str.charAt(i);

            if(s == '{' || s == '[' || s == '('){
                stack.push(s);
            }
            else{
                if(stack.isEmpty())return false;
                char ch = stack.pop();
                if((s == ')' && ch != '(') || (s == '}' && ch != '{') || (s == ']' && ch !='[')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
