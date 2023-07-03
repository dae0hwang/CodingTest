package 순조부;

import java.util.Arrays;
import java.util.Scanner;
import 취업전.복습하기.DFS;

public class 순열 {

    static int n, m;
    static int[] pm, ch, arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        ch = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ch = new int[n];
        pm = new int[m];
        DFS(0);

    }

    public static void DFS(int L) {
        if (L == m) {
            System.out.println(Arrays.toString(ch));
            System.out.println(Arrays.toString(pm));
        } else {
            for (int i = 0; i < n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    pm[L] = arr[i];
                    DFS(L + 1);
                    ch[i] = 0;
                }
            }
        }
    }

}
