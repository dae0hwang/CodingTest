package 알고리즘복습;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class K번째큰수 {
    static int n, k;
    static int[] arr;
    static TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
    static int[] dis = new int[3];
    static int[] ch;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ch = new int[n];
        DFS(0);
        System.out.println(set);
    }

    public static void DFS(int V) {
        if (V == 3) {
            int sum = 0;
            for (int di : dis) {
                sum += di;
            }
            set.add(sum);
        } else {
            for (int i = 0; i < n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    dis[V] = arr[i];
                    DFS(V + 1);
                    ch[i] = 0;
                }
            }
        }
    }

}
