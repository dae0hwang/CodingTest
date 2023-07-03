package 취업전.그리디;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 최대수입스케쥴 {
    static class Lecture implements Comparable<Lecture>{
        public int money;
        public int time;
        Lecture(int money, int time) {
            this.money = money;
            this.time = time;
        }
        @Override
        public int compareTo(Lecture ob){
            return ob.time-this.time;
        }
        @Override
        public String toString() {
            return "Lecture{" +
                "money=" + money +
                ", time=" + time +
                '}';
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Lecture> arr = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            int m=sc.nextInt();
            int d=sc.nextInt();
            arr.add(new Lecture(m, d));
            //가장 큰 날을 기억해 둔다. 여기서는 3
            if(d>max) max=d;
        }

        int answer=0;

        //시간 내림 차순으로 정렬
        Collections.sort(arr);
        //poll하면 가장 큰 값이 나올 수 있게 reversOrder를 한다.
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());

        //한번 넣은 수는 다시 넣지 않도록 for문에서 분리
        int k = 0;
        //3일차 부터 1일차까지 PQ안에 값 중 가장 큰 값을 구한다.
        for (int i = max; i >= 1; i--) {
            //리스트를 탐색해서 각 일차에 맞는 값을 PQ에 넣는다.
            for (; k < n; k++) {
                if(arr.get(k).time<i) break;
                pQ.offer(arr.get(k).money);
            }
            //각 일차에 PQ에서 가장 큰 값을 answer에 더한다.
            if(!pQ.isEmpty()) {
                Integer poll = pQ.poll();
                answer+=poll;
            }
        }
        System.out.println(answer);
    }
}
