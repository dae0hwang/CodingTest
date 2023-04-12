package 그리디;

import java.util.Arrays;
import java.util.Scanner;

public class 다익스트라알고리즘 {
    static int n, m;
    static int[][] board;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        board = new int[n + 1][n + 1]; //인덱스 별로 지정 0 0은 지정 안함
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int di = sc.nextInt();
            board[x][y] = di;
        }
        //board완성함.
        System.out.println(Arrays.deepToString(board));

    }

}
