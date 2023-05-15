package 백준DFSBFS;

import java.util.Arrays;
import java.util.Scanner;

public class 암호만들기 {

    static int r, n;
    static String[] arr;
    static String[] combi;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        n = sc.nextInt();
        arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        Arrays.sort(arr);
        combi = new String[r];
        DFS(0, 0);
    }

    public static void DFS(int L, int s) {
        if (L == r) {
            //조합의 경우의 수가 완성되었으니,
            //최소 한개의 모음 두개의 자음이 포함되면 출려할 수 있게 설정
            solution(combi);
        } else {
            for (int i = s; i < n; i++) {
                combi[L] = arr[i];
                DFS(L + 1, i + 1);
            }
        }
    }

    public static void solution(String[] combi) {
        int c = 0;
        int v = 0;
        for (String s : combi) {
            if (s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u")) {
                v++;
            } else {
                c++;
            }
        }
        if (v >= 1 && c >= 2) {
            for (String x : combi) {
                System.out.print(x);
            }
            System.out.println();
        }
    }
}
