package 순조부;

import java.util.Arrays;
import java.util.Scanner;
import 취업전.복습하기.DFS;

public class 조합출력 {
    static int n, m;
    static int[] answer, ch;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        answer = new int[m];
        DFS(0,0);

    }

    public static void DFS(int L, int a) {
        if (L == m) {
            System.out.println(Arrays.toString(answer));
        } else {
            for (int i = a; i < n; i++) {
                answer[L] = i + 1;
                DFS(L + 1, i+1);
            }
        }
    }

}
