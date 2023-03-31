package DFS2;

import java.util.Arrays;
import java.util.Scanner;

public class 합이같은부분집합 {

    static String answer = "NO";
    static int n, total = 0;
    static boolean flag = false;
    static int[] arr;

    public static void DFS(int L, int sum) {
        if (flag) return;
        if (L == n) {
            //포함 된 것 arr[L]의 값이 합으로 들어 간 것
            DFS(L + 1, sum + arr[L]);
            //arr[L]의 값이 합으로 포함되지 않은 경우
            DFS(L + 1, sum);
        }
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
            total+=arr[i];
        }
    }

}
