package 취업전.복습;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 그래프최단거리 {
    static int n, m;
    static ArrayList<ArrayList<Integer>> graph;

    static int[] ch;
    static int[] answer;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph=new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        ch = new int[n + 1];
        ch[1] = 0;
        answer = new int[n + 1];
        BFS(1);
        for (int i = 2; i < answer.length; i++) {
            System.out.print(i+" : "+answer[i]);
            System.out.println();
        }
    }

    public static void BFS(int n) {
        Queue<Integer> q = new LinkedList<>();
        int L = 1;
        q.add(n);
        while (!q.isEmpty()) {
            int cnt = q.size();
            for (int i = 0; i < cnt; i++) {
                int current = q.poll();
                for (Integer v : graph.get(current)) {
                    if (answer[v] == 0) {
                        answer[v] = L;
                        q.add(v);
                    }
                }
            }
            L++;
        }
    }
}
