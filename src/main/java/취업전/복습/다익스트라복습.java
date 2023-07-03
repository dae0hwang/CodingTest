package 취업전.복습;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 다익스트라복습 {

    static int n, m;
    static ArrayList<ArrayList<Edge>> graph;
    static int[] dis;

    static class Edge implements Comparable<Edge> {

        int vex;
        int cost;

        public Edge(int vex, int cost) {
            this.vex = vex;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            return this.cost - o.cost;
        }
    }


    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        m=kb.nextInt();

        dis=new int[n+1];
        Arrays.fill(dis, Integer.MAX_VALUE);

        graph = new ArrayList<ArrayList<Edge>>();
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<Edge>());
        }
        for(int i=0; i<m; i++){
            int a=kb.nextInt();
            int b=kb.nextInt();
            int c=kb.nextInt();
            graph.get(a).add(new Edge(b, c));
        }


        //해당 만든 그래프를 가지고
        PriorityQueue<Edge> pQ = new PriorityQueue<>();
        //1접점에서 1로 가는데 거리는 0이다. 에서 시작
        pQ.offer(new Edge(1, 0));
        dis[0] = 0;

        while (!pQ.isEmpty()) {
            //가장 거리비용이 작은 것을 내뱉다가
            Edge tmp = pQ.poll();
            int now = tmp.vex;
            int nowCost = tmp.cost;
            if (nowCost > dis[now]) {
                //내뱉다가 큰게 나올 수도 있으니깐
                //여기가 이해가 안되네...
                continue;
            }
            for (Edge ob:graph.get(now)) {
                dis[ob.vex] = nowCost + ob.cost;
                pQ.offer(new Edge(ob.vex, nowCost + ob.cost));
            }
        }

    }

}
