package s.levelsort;

import stack.MyStack.MyStack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Author:  Air
 * Date  :  2017/5/13.
 */
public class LevelSortTree {

    public void createStack() {

        MyStack root = new MyStack();



    }

    public void sort(MyStack root) {

        if (root == null) {
            return;
        }

        Queue<MyStack> queue = new LinkedList<>();

        queue.offer(root);


        while (!queue.isEmpty()) {



        }
    }
}
