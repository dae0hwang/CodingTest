package 취업전.복습;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 미로최단거리통로 {

    static int[][] board, dis;
    static int[] dx={-1, 0, 1, 0};
    static int[] dy={0, 1, 0, -1};

    static class Point{
        public int x, y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        board=new int[8][8];
        dis=new int[8][8];
        for(int i=1; i<=7; i++){
            for(int j=1; j<=7; j++){
                board[i][j]=sc.nextInt();
            }
        }
        BFS(1, 1);
        if(dis[7][7]==0) System.out.println(-1);
        else System.out.println(dis[7][7]);
    }

    public static void BFS(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(x, y));
        while (!queue.isEmpty()) {
            Point current = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];
                if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    dis[nx][ny] = dis[current.x][current.y] + 1;
                    queue.add(new Point(nx, ny));
                }
            }
        }
    }

}
