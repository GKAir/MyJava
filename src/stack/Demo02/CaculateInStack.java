package stack.Demo02;

import stack.MyStack.MyStack;

import java.util.Scanner;

/**
 * Author:  Air
 * Date  :  2017/5/4.
 */
public class CaculateInStack {

    public static void main(String[] args) {
        MyStack<Integer> numStack = new MyStack<>();
        MyStack<String> operStack = new MyStack<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个运算表达式");

        String sent = "((11+33)/11-2*4)*(8-3)";
        String sent2 = "1+2*3-4/5*6";

        char[] cArr = sent2.toCharArray();

        String s;

        for (char c : cArr) {
            s = c + "";
            if (s.matches("[0-9]")) {
                numStack.push(Integer.parseInt(s));
            }
            if (s.equals("*") || s.equals("/")) {
                    if (operStack.getTop().equals("/")) {
                        int a = numStack.pop();
                        int b = numStack.pop();
                        operStack.pop();
                        a = b / a;
                        numStack.push(a);
                }
                operStack.push(s);
            } else if (s.equals("+") || s.equals("-")) {

                if (!operStack.isEmpty()) {
                    if (operStack.getTop().equals("*") || operStack.getTop().equals("/")) {
                        int a = numStack.pop();
                        int b = numStack.pop();
                        String s1 = operStack.pop();
                        switch (s1) {
                            case "*":
                                a = a * b;
                                numStack.push(a);
                                break;
                            case "/":
                                a = b / a;
                                numStack.push(a);
                                break;
                        }
                    }

                }
                    operStack.push(s);
            }
        }

        while (!numStack.isEmpty() && !operStack.isEmpty()) {
            int a = numStack.pop();
            int b = numStack.pop();
            String s1 = operStack.pop();
            switch (s1) {
                case "+":
                    a = a + b;
                    numStack.push(a);
                    break;
                case "-":
                    a = b - a;
                    numStack.push(a);
                    break;
                case "*":
                    a = b * a;
                    numStack.push(a);
                    break;
                case "/":
                    a = b / a;
                    numStack.push(a);
                    break;
            }
        }
        System.out.println("表达式的结果为：" + numStack.getTop());
    }
}
