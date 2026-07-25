class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();

        for(int i = 0 ; i < s.length() ; i++){
            char sb = s.charAt(i);

            if(sb == '(' || sb == '[' || sb == '{'){
                stack.push(sb);
            }else{
                if(stack.isEmpty()) return false;
                char ch = stack.pop();
                if((sb == ')' && ch != '(') || (sb == '}' && ch != '{') || (sb == ']' && ch !='[')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}