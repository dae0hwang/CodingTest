package 알고리즘복습;

import java.util.Arrays;
import java.util.Scanner;

public class 친구인가 {

    static int n, m;
    static int[] unf;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        unf = new int[n + 1]; //1 ~ 9까지
        for (int i = 0; i < unf.length; i++) {
            unf[i] = i;
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            union(a, b);
        }
        System.out.println(Arrays.toString(unf));
        int a=sc.nextInt();
        int b=sc.nextInt();
        int fa=Find(a);
        int fb=Find(b);
        if(fa==fb) System.out.println("YES");
        else System.out.println("NO");


    }

    public static void union(int a, int b) {
        int fa = Find(a);
        int fb = Find(b);
        if (fa != fb) {
            unf[fa] = fb;
        }
    }


    //둘이 친구인지 확인
    public static int Find(int v) {
        if (v == unf[v]) {
            return v;
        } else {
            //헷갈리지 않게 같은 거나올때까지 위로 타고 올라간다고 생각하자
            return Find(unf[v]);
        }
    }
}
