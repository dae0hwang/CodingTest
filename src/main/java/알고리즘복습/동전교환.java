package 알고리즘복습;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 동전교환 {

    static int n, m;
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        m = sc.nextInt();
        System.out.println(BFS());

    }

    public static int BFS() {
        int L = 1;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.add(arr[i]);
        }
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                int num = queue.poll();
                if (num == m) {
                    return L;
                }
                for (int j = 0; j < n; j++) {
                    queue.add(num + arr[j]);
                }
            }
            L++;
        }
        return 0;
    }

}
