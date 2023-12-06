class Solution {
    public boolean isValid(String s) {

    if(s.length() < 2) {
        return false;
    }
    
    Stack<Character> myStack = new Stack<>();

    for(int i = 0; i < s.length(); i++) {
        if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
            myStack.push(s.charAt(i));
        }
        else if(!myStack.isEmpty() && ((s.charAt(i) == ')' && myStack.peek() == '(') 
        || (s.charAt(i) == '}' && myStack.peek() == '{') 
        || (s.charAt(i) == ']' && myStack.peek() == '['))) {
            myStack.pop();
        }
        else {
            return false;
        }
    }
    return myStack.isEmpty();
    }
}
