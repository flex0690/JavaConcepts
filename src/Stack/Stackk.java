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

    public void stockSpanProblem() { //gfg  good problem
        // next greater element variation

//        int [] arr = {60,10,20,40,35,38,50,70,65};
        int [] arr = {5,4,3,2,1};

        ArrayDeque<Integer> myStack = new ArrayDeque<>();

        System.out.println(1);
        myStack.add(0);

        for(int i=1; i< arr.length ; i++) {
            if (!myStack.isEmpty() && arr[myStack.peekLast()] > arr[i]) {
                System.out.println(i - myStack.peekLast());
                myStack.add(i);
            } else {
                while( !myStack.isEmpty() && arr[i] > arr[myStack.peekLast()] ) {
                    myStack.removeLast();
                }
                if (myStack.isEmpty()) {
                    System.out.println(i+1);
                    myStack.add(i);
                } else {
                    System.out.println(i - myStack.peekLast());
                    myStack.add(i);
                }
            }
        }
    }


    public  void main(String[] args) {
//        basicOfStack();
        stockSpanProblem();
    }
}
