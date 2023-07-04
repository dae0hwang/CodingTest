package 알고리즘복습;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 섬나라아일랜드2 {

    static int n, answer=0;
    static int[][] board;
    static int[] dx = {1, 0, -1, 0, -1, -1, 1, 1};
    static int[] dy = {0, 1, 0, -1, -1, 1, 1, -1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        check();
        System.out.println(answer);
    }

    public static void check() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int check = board[i][j];
                if (check == 1) {
                    //해당 i,j bfs로 넘겨라!!
                    answer++;
                    BFS(i, j);
                }
            }
        }
    }

    public static void BFS(int x, int y) {
        Queue<Point> Q = new LinkedList<>();
        Q.add(new Point(x, y));
        while (!Q.isEmpty()) {
            Point tmp = Q.poll();
            for (int i = 0; i < 8; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < 7 && board[nx][ny] == 1) {
                    board[nx][ny] = 0;
                    Q.add(new Point(nx, ny));
                }
            }
        }
    }
}
