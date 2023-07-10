package 토스;

import java.util.ArrayList;
import java.util.List;

public class 멋쟁이 {

    public static void main(String[] args) {
        멋쟁이 a = new 멋쟁이();
        a.solution("1234", 3);
    }

    static List<Integer> list = new ArrayList<>();
    static int[] check, dis;

    public int solution(String s, int N) {
        boolean flag = false;
        int max = Integer.MIN_VALUE;
        check = new int[N + 1];
        dis = new int[N];
        DFS(0, N);
        for (int i = 0; i < s.length() - N+1; i++) {
            String temp = s.substring(i, i + N);
            Integer integer = Integer.valueOf(temp);
            if (list.contains(integer)) {
                flag = true;
                max = Math.max(max, integer);
            }

        }
        if (flag) {
            return max;
        } else {
            return -1;
        }
    }

    public static void DFS(int V, int n) {
        if (V == n) {
            int number = 0;
            for (int di : dis) {
                number *= 10;
                number += di;
            }
            list.add(number);
        } else {
            for (int i = 1; i <= n; i++) {
                if (check[i] == 0) {
                    check[i] = 1;
                    dis[V] = i;
                    DFS(V+1, n);
                    check[i] = 0;
                }
            }
        }
    }
}
