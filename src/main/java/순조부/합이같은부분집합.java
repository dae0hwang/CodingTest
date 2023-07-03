package 순조부;

import java.util.Arrays;
import java.util.Scanner;

public class 합이같은부분집합 {

    static boolean flag = false;
    static int n, sum;
    static int[] arr;
    static boolean[] ch;

    public static void DFS(int v, int all) {
        if (v == n) {
            System.out.println(all);
            if (sum == all) {
                flag = true;
            }
        } else {
            DFS(v + 1, all+arr[v]);
            DFS(v + 1, all);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ch = new boolean[n];
        sum = Arrays.stream(arr).sum()/2;
        DFS(0,0);
        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
