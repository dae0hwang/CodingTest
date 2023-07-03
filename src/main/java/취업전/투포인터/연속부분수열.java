package 취업전.투포인터;

import java.util.Arrays;
import java.util.Scanner;

public class 연속부분수열 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        ch = new int[n + 1];

        //DFS
        DFS(1);
        System.out.println(count);

    }
    static int n, m, count=0;
    static int[] arr, ch;

    public static void DFS(int L) {
        if (L == n+1) {
//            System.out.println(Arrays.toString(ch));
            int sum = 0;
            for (int i = 1; i < ch.length; i++) {
                if (ch[i] == 1) {
                    sum += arr[i];
                }
            }
            if (sum == m) {
                count++;
            }
        } else {
            ch[L] = 1;
            DFS(L + 1);
            ch[L] = 0;
            DFS(L + 1);
        }
    }

}
