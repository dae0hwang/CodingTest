package 취업전.DFS2;

import java.util.Arrays;
import java.util.Scanner;

public class 최대점수구하기 {

    static class Node {
        int time;
        int score;
        public Node(int time, int score) {
            this.time = time;
            this.score = score;
        }
    }
    static int n, m;
    static int result = Integer.MIN_VALUE;
    static Node[] arr;

    //v가 == 5일 때 즉 부분집합의 경우의 수를 완성 했을 때,
    // 시간의 합과 점수 합을 비교하기 위해 파라미터에 넣어두었다.
    public static void DFS(int v, int timeSum, int scoreSum) {
        //DFS를 진행하다가, 시간의 합이 기준보다 초과하면 그 아래 DFS 진행하지 않고 바로 끝내버린다.
        if (timeSum > m) {
            return;
        }
        if (v == n) {
            result = Integer.max(result, scoreSum);
        } else {
            //점수10시간5가 포함 되었을 때,
            DFS(v + 1, timeSum + arr[v].time, scoreSum + arr[v].score);
            //점수10시간5가 포함 되지 않았을 때, 경우의 수
            DFS(v + 1, timeSum , scoreSum);
            //구할 수 있게 DFS를 설정했다.
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new Node[n];
        for (int i = 0; i < arr.length; i++) {
            int score = sc.nextInt();
            int time = sc.nextInt();
            arr[i] = new Node(time, score);
        }
        DFS(0, 0, 0);
        System.out.println(result);
    }
}
