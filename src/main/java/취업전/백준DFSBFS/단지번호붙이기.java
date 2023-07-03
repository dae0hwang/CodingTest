package 취업전.백준DFSBFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 단지번호붙이기 {

    static int n, cnt;
    static int[][] board;
    static ArrayList<Integer> answer;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        board = new int[n][n];
        //전체 사각형 입력 받기
        for(int i=0; i<n; i++){
            String input = sc.next();
            for(int j=0; j<n; j++){
                board[i][j] = input.charAt(j)-'0';
            }
        }

        cnt = 0;
        answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    cnt++;
                    sum = 0;
                    DFS(i, j);
                    answer.add(sum);
                }
            }
        }

        System.out.println(cnt);
        Collections.sort(answer);
        for (Integer integer : answer) {
            System.out.println(integer);
        }

    }

    static int sum;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void DFS(int x, int y) {
        if (board[x][y] == 0) {
            return;
        } else {
            board[x][y] = 0;
            sum++;
            //네방향으로 뻗어 갑니다.
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx>=0 && nx<n &&ny>=0&& ny<n&&board[nx][ny]==1)
                DFS(nx, ny);
            }
        }
    }

}
