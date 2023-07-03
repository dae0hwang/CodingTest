package 취업전.DFS2;

import java.util.Scanner;

public class 조합구하기 {

    static int n, r;
    //조합을 담을 배열
    static int[] combi;

    public static void DFS(int L, int s) {
        if (L == r) {
            for(int x : combi) System.out.print(x+" ");
            System.out.println();
        } else {
            //DFS로 조합을 구하는 핵심 풀이
            for (int i = s; i <= n; i++) {
                combi[L] = i;
                DFS(L + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        r = sc.nextInt();
        combi = new int[r];
        DFS(0, 1);
    }
}
