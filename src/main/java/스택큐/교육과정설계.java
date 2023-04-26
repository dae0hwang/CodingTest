package 스택큐;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 교육과정설계 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String t = sc.next();

        char[] chars = t.toCharArray();
        Queue<Character> queue = new LinkedList<>();
        for (char c : n.toCharArray()) {
            queue.add(c);
        }
        System.out.println(queue);
        char first = queue.peek();
        for (char aChar : chars) {
            if (first == aChar && !queue.isEmpty()) {
                queue.poll();
                first = queue.peek();
            }
        }
        System.out.println(queue);
        if (queue.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
