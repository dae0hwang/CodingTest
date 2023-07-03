package 취업전.BFS2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 동전교환 {
    static int n, m;
    static int[] arr;

    public static int BFS() {
        Queue<Integer> queue = new LinkedList();
        for (int i : arr) {
            queue.add(i);
        }
        int L = 1;
        //L=1부터 시작 동전 1개만 쓸경우 {1,2,5}
        while (!queue.isEmpty()) {
            int len = queue.size();
            //L=1일 때는 3개만 뽑아서 해야한다.
            //L=2인 경우는, 9개
            for (int i = 0; i < len; i++) {
                Integer cv = queue.poll();
                for (int n : arr) {
                    int nv = cv + n;
                    if (nv == m) {
                        return L + 1;
                    }
                    queue.add(nv);
                }
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        m = sc.nextInt();
        int answer = BFS();
        System.out.println(answer);
    }
}
