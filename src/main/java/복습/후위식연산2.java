package 복습;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class 후위식연산2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        char[] chars = next.toCharArray();
        Stack<Integer> stack = new Stack<>();
        for (char x : chars) {
            if(Character.isDigit(x)){
                stack.push(x-48);
            }
            else{
                int rt=stack.pop();
                int lt=stack.pop();
                if(x=='+') stack.push(lt+rt);
                else if(x=='-') stack.push(lt-rt);
                else if(x=='*') stack.push(lt*rt);
                else if(x=='/') stack.push(lt/rt);
            }
        }
        System.out.println(stack.get(0));
    }
}
