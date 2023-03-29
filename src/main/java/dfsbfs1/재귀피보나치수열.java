package dfsbfs1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class 재귀피보나치수열 {

    static int[] arr = new int[11];
    public static int DFS(int n) {
        if (arr[n] > 0) {
            return arr[n];
        }
        if (n == 1) {
            return arr[1] = 1;
        } else if (n == 2) {
            return arr[2] =1;
        } else {
            return arr[n] = DFS(n - 1) + DFS(n - 2);
        }
    }
    public static void main(String[] args) {
        DFS(10);
        System.out.println(Arrays.toString(arr));
    }
}
