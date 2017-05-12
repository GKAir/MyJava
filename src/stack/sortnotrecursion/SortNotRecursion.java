package stack.sortnotrecursion;

import stack.MyStack.MyStack;

import java.util.Stack;

/**
 * Author:  Air
 * Date  :  2017/5/12.
 */
public class SortNotRecursion {

    public static void main(String[] args) {
        MyStack<Integer> root = new MyStack<>();

        Stack<MyStack> s = new Stack<>();
        s.push(root);

        MyStack current;

        int state = root.getState();

        while (!s.empty()) {
            current = s.peek();

            if (state == 0) {
                if (current.left != null) {
                    s.push(current.left);
                }
                state = 1;
            } else if (state == 1) {
                System.out.println(current.getState());
                state = 2;
            } else if (state == 2) {
                if (current.right != null) {
                    s.push(current.right);
                }
                state = 3;
            } else if (state == 3) {
                s.pop();
                state = 0;
            }
        }
    }
}
