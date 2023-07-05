package 알고리즘복습;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 공주구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            q.add(i);
        }
        while (q.size() > 1) {
            for (int i = 1; i <= k; i++) {
                if (i == k) {
                    q.poll();
                } else {
                    Integer poll = q.poll();
                    q.add(poll);
                }
                System.out.println(q);
            }
        }

    }
}
