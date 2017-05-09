package stack.Demo1;

import stack.MyStack.MyStack;

import java.util.Scanner;

/**
 * Author:  Air
 * Date  :  2017/5/4.
 */
public class ResultInStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个后缀表达式");

        char[] cArr = sc.nextLine().toCharArray();

        MyStack<String> stack = new MyStack<>();

        String s;

        for (char c :
                cArr) {
            s = c + "";

            if (!(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/"))) {
                stack.push(s);
            } else {
//                if (s.equals("+")) {
//                    int a = Integer.parseInt(stack.pop());
//                    int b = a + Integer.parseInt(stack.pop());
//                    stack.push(b + "");
//                }
//                if (s.equals("-")) {
//                    int a = Integer.parseInt(stack.pop());
//                    int b = a - Integer.parseInt(stack.pop());
//                    stack.push(b + "");
//                }
//                if (s.equals("*")) {
//                    int a = Integer.parseInt(stack.pop());
//                    int b = a * Integer.parseInt(stack.pop());
//                    stack.push(b + "");
//                }
//                if (s.equals("/")) {
//                    int a = Integer.parseInt(stack.pop());
//                    int b = a / Integer.parseInt(stack.pop());
//                    stack.push(b + "");
//                }
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                switch (s) {
                    case "+":
                        stack.push((a + b) + "");
                        break;
                    case "-":
                        stack.push((a - b) + "");
                        break;
                    case "*":
                        stack.push((a * b) + "");
                        break;
                    case "/":
                        stack.push((a / b) + "");
                        break;
                }
            }
        }
        String num = stack.pop();
        System.out.println("结果为：" + num);
    }
}
