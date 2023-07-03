package 취업전.복습;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 공주구하기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }
        System.out.println(queue.size());
        int count = 0;
        while (queue.size() != 1) {
            System.out.println("들어옴");
            count++;
            if (count == k) {
                queue.poll();
                count = 0;
            } else {
                Integer poll = queue.poll();
                queue.add(poll);
            }
        }

        System.out.println(queue);
    }

}
