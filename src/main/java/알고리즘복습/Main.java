package 알고리즘복습;

public class Main {

    static int[] board;

    public static int DFS(int n) {
        if (board[n] != 0) {
            return board[n];
        } else if (n == 1) {
            board[1] = 1;
            System.out.print(1 +" ");
            return board[n];
        } else if (n == 2) {
            board[2] = 1;
            System.out.print(1+" ");
            return board[n];
        } else {
            int sum = DFS(n - 1) + DFS(n - 2);
            board[n] = sum;
            System.out.print(board[n] + " ");
            return board[n];
        }
    }
    public static void main(String[] args) {
        board = new int[46];
        DFS(10);
    }
}
