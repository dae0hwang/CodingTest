package 프로그래머스;

import java.util.Arrays;

public class 예산 {

    public static void main(String[] args) {
        예산 d = new 예산();
        d.solution(new int[]{1, 3, 2, 5, 4}, 9);
    }

    static int[] check, arr;
    static int len;
    static int max, answer;
    public int solution(int[] d, int budget) {
        arr = d;
        len = d.length;
        check = new int[len];
        max = Integer.MIN_VALUE;
        answer = 0;
        DFS(0,0,0);
        return answer;
    }

    public static void DFS(int V, int sum, int count) {
        if (V == len) {
            System.out.println(count+" "+ sum);
        } else {
            DFS(V + 1, sum+ arr[V], count++);
            DFS(V + 1, sum, count);
        }
    }
    public static void DFS(int V) {
        if (V == len) {
            for (int i = 0; i < check.length; i++) {
                if (check[i] != 0) {
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        } else {
            check[V] = 1;
            DFS(V + 1);
            check[V] = 0;
            DFS(V + 1);
        }
    }
}
