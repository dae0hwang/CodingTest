package 백준스택큐;

import java.util.Scanner;
import java.util.Stack;

public class 괄호 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            solution(sc.next());
        }
    }

    public static void solution(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char aChar : chars) {
            if (aChar == '(') {
                stack.push(aChar);
            } else {
                if (!stack.isEmpty()&&stack.peek() == '(') {
                    stack.pop();
                } else {
                    stack.add(aChar);
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
