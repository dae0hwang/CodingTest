package 알고리즘복습;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

class B implements Comparable<B>{
    int money, end;

    public B(int money, int end) {
        this.money = money;
        this.end = end;
    }

    @Override
    public String toString() {
        return "B{" +
            "money=" + money +
            ", end=" + end +
            '}';
    }

    @Override
    public int compareTo(B o) {
        //시간 내림 차순으로 해야하나? ㅇㅇ
        return o.end -this.end; //돈으로 해야하나? 굳이 그날 것 다 할텐데.
    }
}
public class 최대수입스케줄 {

    static int n, first, last, sum;
    static List<B> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        first = Integer.MAX_VALUE;
        last = Integer.MIN_VALUE;

        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            int e = sc.nextInt();
            first = Math.min(e, first);
            last = Math.max(e, last);
            list.add(new B(m, e));
        }
        //시작날하고 끝나는 날 확인 시작날부터 차근히 해보기 프리오티큐 넣어서 최대값 계산하기
        Collections.sort(list);
//        System.out.println(first);
//        System.out.println(last);
//        for (B b : list) {
//            System.out.println(b);
//        }
        BFS();
        System.out.println(sum);
    }

    public static void BFS() {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        Queue<B> q = new LinkedList<>();
        for (B b : list) {
            q.add(b);
        }
        //역으로 큰것을 보낼 수 있도록
        for (int i = last; i >= first; i--) {
            while (!q.isEmpty()) {
                B peek = q.peek();
                if (peek.end >= i) {
                    B poll = q.poll();
                    priorityQueue.add(poll.money);
                } else {
                    break;
                }
            }
            sum += priorityQueue.poll();
        }
    }
}
