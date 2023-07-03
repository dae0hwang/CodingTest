package 취업전.복습;

import java.util.Scanner;

public class 경로탐색 {
    static int n, m;
    static int[][] graph;
    static int answer = 0;
    public static void DFS(int n) {
        if (n == m) {
            answer++;
        } else {
            for (int i = 1; i < n+1; i++) {
                if (graph[n][i] == 1) {
                    System.out.println(n+" "+i);
                    graph[n][i] = 0;
                    DFS(i);
                    graph[n][i] = 1;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new int[n + 1][n + 1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
        }

        //a에서 b로 갈 수 있다.ㅇㅇ가능
        DFS(1);
        System.out.println(answer);
    }

}
