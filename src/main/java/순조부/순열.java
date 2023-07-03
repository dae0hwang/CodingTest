package 순조부;

import java.util.Arrays;
import java.util.Scanner;
import 취업전.복습하기.DFS;

public class 순열 {
    static int n, r;
    static int[] arr;
    static int[] answer;
    static int[] ch;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        r = sc.nextInt();
        arr = new int[n];
        ch = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        answer = new int[r];
        DFS(0);

    }

    public static void DFS(int L) {
        if (L == r) {
            System.out.println(Arrays.toString(answer));
        } else {
            for (int i = L; i < arr.length; i++) {
                if (ch[i] == 0) {
                    answer[L] = arr[i];
                    ch[i] = 1;
                    DFS(L + 1);
                    ch[i] = 0;
                }
            }
        }
    }

}
