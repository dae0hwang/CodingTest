package 취업전.BFS2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 섬나라아일랜드 {
    static class Point{
        int x, y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    static int answer =0, n;
    //네방향이 아닌 대각선을 포함한 8방향으로 뻗어나가는 좌표
    static int[] dx={-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy={0, 1, 1, 1, 0, -1, -1, -1};
    static Queue<Point> queue = new LinkedList<>();

    public static void BFS(int x, int y, int[][] board) {
        queue.add(new Point(x, y));
        while (!queue.isEmpty()) {
            Point pos = queue.poll();
            for (int i = 0; i < 8; i++) {
                int nx=pos.x+dx[i];
                int ny=pos.y+dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
                    board[nx][ny] = 0;
                    queue.add(new Point(x, y));
                }
            }
        }
    }

    public static void solution(int[][] board) {
        //일단 0,0부터 1인것을 찾는다
        //찾았으면 섬 개수(answer) +1한 후,
        //8방향으로 BFS를 진행해서 연결된 곳을 모두 0으로 만든다.
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(board[i][j]==1){
                    answer++;
                    board[i][j]=0;
                    BFS(i, j, board);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        solution(arr);
        System.out.println(answer);
    }

}
