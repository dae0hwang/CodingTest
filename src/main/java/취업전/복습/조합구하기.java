package 취업전.복습;

import java.util.Arrays;
import java.util.Scanner;

public class 조합구하기 {
    static int n, m;
    static int[] arr, answer, ch;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        ch = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        answer = new int[m];
        DFS(0);

    }

    public static void DFS(int n) {
        if (n == m) {
            System.out.println(Arrays.toString(answer));
        } else {
            for (int i = n; i < arr.length; i++) {
                answer[n] = arr[i];
                DFS(n + 1);
            }
        }
    }

}
