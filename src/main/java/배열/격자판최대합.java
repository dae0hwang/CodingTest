package 배열;

import java.util.Scanner;

public class 격자판최대합 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] graph = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                graph[i][j] = sc.nextInt();
            }
        }
        int right = 0;
        for (int i = 0; i < n; i++) {
            right += graph[i][i];
        }
        int left = 0;
        int l = n - 1;
        for (int i = 0; i < n; i++) {
            left += graph[i][l - i];
        }
        System.out.println(right);
        System.out.println(left);

        int big = 0;
        for (int i = 0; i < n; i++) {
            int row = 0;
            for (int j = 0; j < n; j++) {
                row += graph[i][j];
            }
            int col = 0;
            for (int j = 0; j < n; j++) {
                col += graph[j][i];
            }
            int win = Math.max(row, col);
            big = Math.max(big, win);
        }
        System.out.println(big);
    }

}
