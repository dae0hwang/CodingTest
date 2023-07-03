package 알고리즘복습;

import java.io.DataInputStream;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 송아지찾기 {

    static int cur;
    static int des;

    static int[] arr = new int[]{1, -1, 5};
    public static int BFS(int cur, int des) {
        int answer = 0;
        int L = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(cur);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Integer poll = queue.poll();
                if (poll == des) {
                    return answer = L;
                }
                for (int j = 0; j < arr.length; j++) {
                    queue.add(poll + arr[j]);
                }
            }
            L++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cur = sc.nextInt();
        des = sc.nextInt();
        System.out.println(BFS(cur, des));
    }
}
