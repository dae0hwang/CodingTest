package 순조부;

import java.util.Scanner;

public class 조합의수 {
    static int n, m;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        System.out.println(DFS(n, m));
    }

    public static int DFS(int n, int r) {
        if (n == r || r == 0) {
            return 1;
        } else {
            return DFS(n - 1, r - 1) + DFS(n - 1, r);
        }
    }

}
