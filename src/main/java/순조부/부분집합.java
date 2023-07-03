package 순조부;

import java.util.Scanner;

public class 부분집합 {

    static boolean[] board;

    public static void DFS(int n, int v) {
        if (n == v+1) {
            //여기다가 다 뱉는거야
            for (int i = 1; i <= v; i++) {
                if (board[i] == true) {
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        } else {
            board[n] = true;
            DFS(n + 1, v);
            board[n] = false;
            DFS(n + 1, v);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        board = new boolean[input+1];
        DFS(1, input);
    }
}
