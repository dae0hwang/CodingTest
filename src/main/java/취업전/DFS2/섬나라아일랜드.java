package 취업전.DFS2;

import java.util.Scanner;

public class 섬나라아일랜드 {

    static int n, answer =0;
    static int[][] board;
    static int[] dx={-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy={0, 1, 1, 1, 0, -1, -1, -1};

    public static void DFS(int x, int y) {
        //해당 섬 1발견하면 모두 8방향 퍼져나가서 모두 0으로 만드는 DFS 메소드 진행
        for(int i=0; i<8; i++){
            int nx=x+dx[i];
            int ny=y+dy[i];
            if(nx>=0 && nx<n && ny>=0 && ny<n && board[nx][ny]==1){
                board[nx][ny]=0;
                DFS(nx, ny);
            }
        }
    }
    public static void solution() {
        //board
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    board[i][j] = 0;
                    DFS(i,j);
                    answer++;
                }
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        solution();
        System.out.println(answer);

    }
}
