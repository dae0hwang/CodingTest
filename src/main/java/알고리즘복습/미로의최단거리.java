package 알고리즘복습;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class 미로의최단거리 {

    static int[][] board = new int[7][7];
    static int[][] count = new int[7][7];
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -2};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        BFS();
        System.out.println(Arrays.deepToString(board));
    }

    public static void BFS() {
        Queue<Point> q = new LinkedList<>();
        q.add(new Point(0, 0));
        while (!q.isEmpty()) {
            Point now = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];
                if (nx >= 0 && nx < 7 && ny >= 0 && ny < 7 && board[nx][ny] == 0) {
                    board[nx][ny] = board[now.x][now.y] + 1;
                    q.add(new Point(nx, ny));
                }
            }
        }
    }

}
