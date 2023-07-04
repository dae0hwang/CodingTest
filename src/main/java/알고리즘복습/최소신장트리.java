package 알고리즘복습;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 최소신장트리 {

    static int n, m, sum=0;
    static int[] unf;
    static List<U> list = new ArrayList<>();

    static class U implements Comparable<U>{
        int a,b, cost;

        public U(int a, int b, int cost) {
            this.a = a;
            this.b = b;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "U{" +
                "a=" + a +
                ", b=" + b +
                ", cost=" + cost +
                '}';
        }

        @Override
        public int compareTo(U o) {
            return this.cost - o.cost;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        unf = new int[n+1];
        for (int i = 0; i < unf.length; i++) {
            unf[i] = i;
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int cost = sc.nextInt();
            list.add(new U(a, b, cost));
        }

        //최소 비용이니깐 정렬한번 하자
        Collections.sort(list);

        //이것으로 연결합을 구해보자.
        for (U u : list) {
            int a = u.a;
            int b = u.b;
            int cost = u.cost;
            //먼저 둘이 연결되었는 지 확인
            if (Find(a) == Find(b)) {
                //연결되어 있다면 버려
            } else {
                sum += cost;
                Union(a, b);
            }

        }

        System.out.println(sum);
    }


    //유니온 연결하기
    public static void Union(int a, int b) {
        int fa = Find(a);
        int fb = Find(b);
        unf[fa] = fb;
    }

    //최종연결지점 찾기
    public static int Find(int v) {
        if (unf[v] == v) {
            return v;
        } else {
            return Find(unf[v]);
        }
    }

}
