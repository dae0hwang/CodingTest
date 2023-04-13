package 그리디;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 친구인가 {
    static int n, m;
    static ArrayList<ArrayList<Integer>> graph;
    //방문했는지 안 했는지 학인
    static int[] check;

    static boolean flag = false;

    public static void solution(int a, int b) {
        Queue<Integer> q = new LinkedList<>();
        //a에서 시작 뻗어나가기
        q.add(a);
        while (!q.isEmpty()) {
            Integer ct = q.poll();
            for (Integer nt : graph.get(ct)) {
                if (check[nt] == 0) {
                    check[nt] = 1;
                    q.add(nt);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        check = new int[n + 1];

//        for (ArrayList<Integer> list : graph) {
//            System.out.println(list);
//        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        solution(a, b);
        System.out.println(Arrays.toString(check));
    }

}
