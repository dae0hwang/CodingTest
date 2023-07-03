package 취업전.DFS2;

import java.util.Arrays;
import java.util.Scanner;

public class 중복순열 {

    static int n, m;
    static int[] arr;

    public static void DFS(int L) {
        if (L == m) {
            System.out.println(Arrays.toString(arr));
        } else {
            for (int i = 1; i <= n; i++) {
                arr[L] = i;
                DFS(L + 1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[m];
        DFS(0);
    }
}
