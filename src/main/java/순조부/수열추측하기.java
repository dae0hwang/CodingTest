package 순조부;

import java.util.Arrays;
import java.util.Scanner;

public class 수열추측하기 {
    static int n, m;
    static int[] arr, answer, ch;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        answer = new int[n];
        ch = new int[n];
        DFS(0);
    }

    //순열 경우의 수
    public static void DFS(int L) {
        if (L == n) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += answer[i] * DFS2(n - 1, i);
            }
            if (sum == m) {
                System.out.println(Arrays.toString(answer));
            }

            //이제 여기에 조합의 수 구하는 것 넣으면 된다.

        } else {
            for (int i = 0; i < n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    answer[L] = arr[i];
                    DFS(L+1);
                    ch[i] = 0;
                }
            }
        }
    }

    public static int DFS2(int n, int r) {
        if (n == r || r == 0) {
            return 1;
        } else {
            return DFS2(n - 1, r - 1) + DFS2(n - 1, r);
        }
    }

}
