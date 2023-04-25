package 스택큐;

import java.util.Scanner;
import java.util.Stack;

public class 올바른괄호 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Stack<String> stack = new Stack<>();
        String[] split = str.split("");
        for (String s : split) {
            if (s.equals("(")) {
                stack.push(s);
            } else {
                if (stack.peek().equals("(")) {
                    stack.pop();
                } else {
                    stack.push(s);
                }
            }
        }
        if (stack.isEmpty()) {
            System.out.println("YES");

        } else {
            System.out.println("NO");
        }
    }
}
