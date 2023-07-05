package 알고리즘복습;

public class 계단오르기 {

    public static void main(String[] args) {
        int dfs = DFS(7);
        System.out.println(dfs);
    }

    public static int DFS(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            return DFS(n - 1) + DFS(n - 2);
        }
    }
}
