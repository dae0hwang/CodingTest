package 순조부;

import java.util.Arrays;
import java.util.Scanner;

public class 중복순열 {

    //위치만 바뀌면 다른 값이여서 출력해야 한다.
    static int n, r;
    static int[] arr;
    public static void DFS(int v) {
        if (v == r) {
            System.out.println(Arrays.toString(arr));
        } else {
            for (int i = 1; i <= n; i++) {
                arr[v] = i;
                DFS(v + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        r = sc.nextInt();
        arr = new int[r];
        DFS(0);
    }

}
