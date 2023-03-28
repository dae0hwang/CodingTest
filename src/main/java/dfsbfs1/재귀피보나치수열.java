package dfsbfs1;

public class 재귀피보나치수열 {
    public static int DFS(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            return DFS(n - 1) + DFS(n - 2);
        }
    }
    public static void main(String[] args) {
        System.out.println(DFS(5));
    }
}
