package 알고리즘복습;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 송아지찾기2 {

    static int cur;
    static int des;

    static int[] arr = new int[]{1, -1, 5};
    public static int BFS(int cur, int des) {
        int L = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(cur);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Integer poll = queue.poll();
                for (int pl : arr) {
                    int nx = poll + pl;
                    if (nx == des) {
                        return L + 1;
                    } else {
                        queue.add(nx);
                    }
                }
            }
            L++;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cur = sc.nextInt();
        des = sc.nextInt();
        System.out.println(BFS(cur, des));
    }
}
