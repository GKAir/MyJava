package stack.sortnotrecursion;

import stack.MyStack.MyStack;

import java.util.Stack;

/**
 * Author:  Air
 * Date  :  2017/5/12.
 */
public class SortNotRecursion {

    public static void main(String[] args) {
        MyStack<Integer> root = new MyStack<Integer>();

        Stack<MyStack> s = new Stack<>();
        s.push(root);

        MyStack<Integer> currtnt;

        int state = root.getState();

        while (!s.empty()) {
            currtnt = s.peek();


            if()
        }
    }
}
