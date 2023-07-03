package 취업전.복습;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 교육과정설계2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String t = sc.next();

        Queue<Character> queue = new LinkedList<>();
        for (char c : n.toCharArray()) {
            queue.add(c);
        }

        for (char x : t.toCharArray()) {
            if (queue.isEmpty()) {
                break;
            }
            Character peek = queue.peek();
            if (peek.equals(x)) {
                queue.poll();
            }
        }

        System.out.println(queue);
    }
}
