package stack.Demo1;

import stack.MyStack.MyStack;

import java.util.Scanner;

public class MatchBraketsInStack {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一组括号字符串");

        String str = sc.nextLine();

        char[] sArr = str.toCharArray();

        MyStack<String> stack = new MyStack<>();

        String s;

        for (char c : sArr) {
            s = c + "";
            if (s.equals("(") || s.equals("[") || s.equals("{")) {
                stack.push(s);
            }

            if (s.equals(")")) {
                if (stack.isEmpty()) {
                    System.out.println("右小括号不匹配：右多");
                    return;
                }
                if (stack.getTop().equals("(")) {
                    stack.pop();
                }
            }

            if (s.equals("]")) {
                if (stack.isEmpty()) {
                    System.out.println("右中括号不匹配：右多");
                    return;
                }
                if (stack.getTop().equals("[")) {
                    stack.pop();
                }
            }

            if (s.equals("}")) {
                if (stack.isEmpty()) {
                    System.out.println("右大括号不匹配：右多");
                    return;
                }
                if (stack.getTop().equals("{")) {
                    stack.pop();
                }
            }
        }
            if (stack.isEmpty()) {
                System.out.println("匹配成功");
            } else {
                System.out.println("匹配失败，有位置不匹配：左多");
                for (Object s1 :
                        stack) {
                    System.out.println(s1);
                }
            }
    }
}
