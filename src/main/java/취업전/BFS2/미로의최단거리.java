package 취업전.BFS2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 미로의최단거리 {

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

    public static void BFS(int x, int y) {
        Queue<Point> Q=new LinkedList<>();
        Q.offer(new Point(x, y));
        board[x][y]=1;
        while (!Q.isEmpty()) {
            Point tmp = Q.poll();
            for (int i = 0; i < 4; i++) {
                int nx=tmp.x+dx[i];
                int ny=tmp.y+dy[i];
                //다음 갈곳이 1보다 크고 7보다 작으며, 지나가지 않은 곳일 때
                if(nx>=1 && nx<=7 && ny>=1 && ny<=7 && board[nx][ny]==0){
                    board[nx][ny]=1; //아에 보드에 이미 간곳이라고 표시해도 괜찮다. 최소의 값을 구하는 것이기 때문에
                    Q.offer(new Point(nx, ny));
                    //기존 값에 +1해서 값을 저장한다.
                    dis[nx][ny]=dis[tmp.x][tmp.y]+1;
                }
            }
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
}
