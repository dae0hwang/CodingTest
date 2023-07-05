package 알고리즘복습;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 교육설계과정 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        Queue<Character> q = new LinkedList<>();
        for (char c : a.toCharArray()) {
            q.add(c);
        }
        for (char c : b.toCharArray()) {
            if (q.isEmpty()) {
                break;
            }
            Character peek = q.peek();
            if (peek == c) {
                q.poll();
            }
        }

        System.out.println(q);
    }

}
