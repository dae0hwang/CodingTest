package bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 송아지찾기상태트리 {
    static int[] dis = {-1, 1, 5};
    public static int BFS(int S, int E) {
        Queue<Integer> Q = new LinkedList<>();
        Q.add(S);

        while (!Q.isEmpty()) {
            int L = 0;
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                int x = Q.poll();
                for (int di : dis) {
                    int nx = x + di;
                    if (nx == E) {
                        return L + 1;
                    }
                    if (nx >= 1 && nx <= 10000) {
                        Q.offer(nx);
                    }
                }
            }
            L++;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int E = sc.nextInt();
        System.out.println(BFS(S,E));

    }
}
