package 취업전.복습;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 중복순열구하기 {
    static int n, m;
    static int[] arr;
    static int[] ch;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        ch = new int[m+1];
        DFS(1);
    }

    public static void DFS(int V) {
        if (V == m + 1) {
            System.out.println(Arrays.toString(ch));
        } else {
            for (int nextInt : arr) {
                ch[V] = nextInt;
                DFS(V + 1);
            }
        }
    }
}
