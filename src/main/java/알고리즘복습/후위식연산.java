package 알고리즘복습;

import java.util.Scanner;
import java.util.Stack;

public class 후위식연산 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            if (aChar == '+') {
                Character pop1 = stack.pop();
                Character pop2 = stack.pop();
                int a = Integer.parseInt(pop1.toString()) + Integer.parseInt(pop2.toString());
            }
        }

    }
}
