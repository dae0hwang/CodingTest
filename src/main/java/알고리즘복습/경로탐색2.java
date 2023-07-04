package 알고리즘복습;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 경로탐색2 {

    static int N, M, answer=0;
    static List<ArrayList<Integer>> list = new ArrayList<>();

    static int[] ch;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        ch = new int[N + 1];
        for (int i = 0; i < N+1; i++) {
            list.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            list.get(a).add(b);
        }
        for (ArrayList<Integer> integers : list) {
            System.out.println(integers);
        }
        ch[1] = 1;
        DFS(1);
        System.out.println(answer);

    }

    public static void DFS(int x) {
        if (x == 5) {
            answer++;
        } else {
            for (Integer integer : list.get(x)) {
                if (ch[integer] == 0) {
                    ch[integer] = 1;
                    DFS(integer);
                    ch[integer] = 0;
                }
            }
        }
    }

}
