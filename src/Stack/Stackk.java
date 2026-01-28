package Stack;

import java.util.ArrayDeque;
import java.util.Stack;

public class Stackk {

    void basicOfStack() {
//        Stack<Integer> stack = new Stack<>(); // this is old
        ArrayDeque<Integer> stack = new ArrayDeque<>(); // arrayDeque is mordern
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.size());
    }

    // valid parentheses
    public boolean isValid(String s) {
        ArrayDeque<Character> myStack = new ArrayDeque();
        for(int i = 0 ; i < s.length() ; i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                myStack.push(s.charAt(i));
            } else {
                if (myStack.isEmpty()) {
                    return false;
                }
                if( (s.charAt(i) == ')' && myStack.peek() == '(') ||
                        (s.charAt(i) == '}' &&(myStack.peek() == '{')) ||
                        (s.charAt(i) == ']' && myStack.peek() == '[')) {
                    myStack.pop();
                } else {
                    myStack.push(s.charAt(i));
                }
            }
        }

        return myStack.isEmpty();
    }

    public  void main(String[] args) {
        basicOfStack();
    }
}
