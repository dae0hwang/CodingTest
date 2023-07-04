package 알고리즘복습;

import java.util.Arrays;
import java.util.Scanner;

public class 경로탐색1 {

    static int N, M, answer=0;
    static int[][] board;
    static int[] ch;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        board = new int[N+1][N+1];
        ch = new int[N + 1];
        ch[1] = 1;
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            board[a][b] = 1;
        }
        for (int i = 0; i < N+1; i++) {
            System.out.println(Arrays.toString(board[i]));
        }
        DFS(1);
        System.out.println(answer);

    }

    public static void DFS(int x) {
        if (x == 5) {
            answer++;
        } else {
            for (int i = 1; i < N + 1; i++) {
                if (board[x][i] == 1 && ch[i] == 0) {
                    ch[i] = 1;
                    DFS(i);
                    ch[i] = 0;
                }
            }
        }
    }
}
