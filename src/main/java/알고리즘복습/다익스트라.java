package 알고리즘복습;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

class C {
    int v, dis;

    public C(int v, int dis) {
        this.v = v;
        this.dis = dis;
    }

    @Override
    public String toString() {
        return "C{" +
            "v=" + v +
            ", dis=" + dis +
            '}';
    }
}

public class 다익스트라 {

    static int n , m;
    static List<ArrayList<C>> list = new ArrayList<>();
    static int[] dis;
    static int[] check;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        dis = new int[n + 1];
        for (int i = 0; i <dis.length; i++) {
            dis[i] = Integer.MAX_VALUE;
        }
        check = new int[n + 1];
        for (int i = 0; i < n+1; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            list.get(a).add(new C(b, c));
        }
//        for (ArrayList<C> cs : list) {
//            System.out.println(cs);
//        }
        BFS();
    }

    public static void BFS() {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        while (!q.isEmpty()) {
            Integer now = q.poll();
            check[now] = 1;//이미 진행했다. 가도 무의미하다
            for (C c : list.get(now)) {
                dis[c.v] = Math.min(dis[c.v], dis[now] + c.dis);
                if (check[c.v] == 0) {
                    q.add(c.v);
                }
                System.out.println(Arrays.toString(dis));
            }
        }
    }
}
