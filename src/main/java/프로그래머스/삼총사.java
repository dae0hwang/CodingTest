package 프로그래머스;

import java.util.Arrays;

public class 삼총사 {

    public static void main(String[] args) {
        삼총사 a = new 삼총사();
        int solution = a.solution(new int[]{-1, 1, -1, 1});
        System.out.println(solution);

    }

    static int[] arr, dis;
    static int len ,answer;

    public int solution(int[] number) {
        arr = number;
        len = arr.length;
        dis = new int[3];
        answer = 0;
        DFS(0, 0);
        return answer;
    }

    public static void DFS(int V, int r) {
        if (V == 3) {
            int sum = Arrays.stream(dis).sum();
            if (sum == 0) {
                answer++;
            }
        } else {
            for (int i = r; i < len; i++) {
                dis[V] = arr[i];
                DFS(V + 1, i + 1);
            }
        }
    }
}
