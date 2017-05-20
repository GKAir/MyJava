package stack.sortnotrecursion;

import stack.MyStack.MyStack;

import java.util.Stack;

/**
 * Author:  Air
 * Date  :  2017/5/12.
 */
/*
    二叉树的非递归遍历(中序)

 */
public class SortNotRecursion {

    public static void main(String[] args) {

        MyStack<Integer> root = new MyStack<>();
        //创建一个栈接收数据
        Stack<MyStack> s = new Stack<>();
        //根节点入栈
        s.push(root);
        //定义  当前节点
        MyStack current;
        //定义根节点的状态值
        int state = root.getState();
        //当栈非空时
        //每次循环当前栈顶值，只做一件事
        while (!s.empty()) {
            //当前值 = 栈的顶端值
            current = s.peek();
            //状态值 = 0：该节点是第一次访问，如果左子树非空递归
            if (state == 0) {
                if (current.left != null) {
                    s.push(current.left);
                }
                //状态值设为1
                state = 1;
                //状态值 = 1：该节点是第二次访问
            } else if (state == 1) {
                //输出数据
                System.out.println(current.getState());
                state = 2;
                //状态值 = 2：该节点是第三次访问，如果右子树非空递归
            } else if (state == 2) {
                if (current.right != null) {
                    s.push(current.right);
                }
                state = 3;
                //状态值 = 3 ：最后一次访问 出栈
            } else if (state == 3) {
                s.pop();
                state = 0;
            }
        }
    }
}
