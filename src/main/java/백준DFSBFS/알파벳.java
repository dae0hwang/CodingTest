package 백준DFSBFS;

import java.util.Arrays;
import java.util.Scanner;

public class 알파벳 {

    static int r, c ;
    static int[][] board;
    static int[] check;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int max = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        c = sc.nextInt();
        board = new int[r][c];
        check = new int[1000];

        for (int i = 0; i < r; i++) {
            String next = sc.next();
            char[] chars = next.toCharArray();
            for (int j = 0; j < chars.length; j++) {
                board[i][j] = chars[j];
            }
        }
        DFS(0, 0, 1);
        System.out.println(max);
    }

    public static void DFS(int cx, int cy, int sum) {
        check[board[cx][cy]] = 1;
        max = Math.max(sum, max);
        for (int i = 0; i < 4; i++) {
            int nx = cx + dx[i];
            int ny = cy + dy[i];
            if (nx >= 0 && nx < r && ny >= 0 && ny < c && check[board[nx][ny]]== 0) {
                DFS(nx, ny, sum+1);
            }
        }
    }
}
