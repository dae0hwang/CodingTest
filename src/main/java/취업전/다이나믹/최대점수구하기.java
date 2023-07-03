package 취업전.다이나믹;

import java.util.Arrays;
import java.util.Scanner;

public class 최대점수구하기 {

    static class Node implements Comparable<Node>{
        private int time, score;

        public Node(int time, int score) {
            this.time = time;
            this.score = score;
        }

        @Override
        public String toString() {
            return "Node{" +
                "time=" + time +
                ", score=" + score +
                '}';
        }

        @Override
        public int compareTo(Node o) {
            return o.score - this.score;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        Node[] arr = new Node[n];
        Node[] dy = new Node[n];
        for (int i = 0; i < n; i++) {
            int score = sc.nextInt();
            int time = sc.nextInt();
            Node node = new Node(time, score);
            arr[i] = node;
        }
        Arrays.sort(arr);
        for (int i = 0; i < dy.length; i++) {
            dy[i] = new Node(0, 0);
        }
//        System.out.println(Arrays.toString(arr));
        dy[0] = arr[0];

        for (int i = 1; i < n; i++) {
            Node current = arr[i];
            for (int j = i-1; j >=0 ; j--) {
                if (dy[j].time + current.time <= m) {
                    if (dy[i].score < dy[j].score + current.score) {
                        dy[i] = new Node(dy[j].time + current.time, dy[j].score + current.score);
                    }
                }
            }
        }

        int answer = 0;
        for (Node node : dy) {
            answer = Math.max(answer, node.score);
        }
        System.out.println(answer);
    }
}
