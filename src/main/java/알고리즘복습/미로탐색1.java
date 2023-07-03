package 알고리즘복습;

import java.util.Arrays;
import java.util.Scanner;
import 취업전.복습하기.DFS;

public class 미로탐색1 {

    static int[][] board= new int[7][7];
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int answer = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        //요게 핵심
        board[0][0] = 1;
        DFS(0, 0);
        System.out.println(answer);
    }

    public static void DFS(int x, int y) {
        if (x == 6 && y == 6) {
            answer++;
        } else {
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 0 && nx <= 6 && ny >= 0 && ny <= 6 && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    DFS(nx, ny);
                    board[nx][ny] = 0;
                }
            }
        }
    }



}
