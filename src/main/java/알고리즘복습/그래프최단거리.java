package 알고리즘복습;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class 그래프최단거리 {
    static int n, m;
    static ArrayList<ArrayList<Edge>> graph;
    static int[] dis;

    static class Edge implements Comparable<Edge>{
        public int vex;
        public int cost;

        @Override
        public String toString() {
            return "Edge{" +
                "vex=" + vex +
                ", cost=" + cost +
                '}';
        }

        Edge(int vex, int cost) {
            this.vex = vex;
            this.cost = cost;
        }
        @Override
        public int compareTo(Edge ob){
            //우선 순위 큐에서 cost가 가장 작은 값이 나올 수 있게
            // cost를 오름차순으로 정렬한다.
            return this.cost-ob.cost;
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
        for (ArrayList<Edge> edges : graph) {
            System.out.println(edges);
        }

        solution(1);

        for(int i=2; i<=n; i++){
            if(dis[i]!=Integer.MAX_VALUE) System.out.println(i+" : "+dis[i]);
            else System.out.println(i+" : impossible");
        }
    }

    public static void solution(int v){
        PriorityQueue<Edge> pQ = new PriorityQueue<>();
        pQ.offer(new Edge(v, 0));
        dis[v] = 0;
        while (!pQ.isEmpty()) {
            Edge tmp = pQ.poll();
            int now=tmp.vex;
            int nowCost=tmp.cost;
//            if (nowCost > dis[now]) {
//                continue;
//            }
            for (Edge ob : graph.get(now)) {
                if (dis[ob.vex] > nowCost + ob.cost) {
                    dis[ob.vex] = nowCost + ob.cost;
                    pQ.offer(new Edge(ob.vex, nowCost + ob.cost));
                }
            }

        }
    }


}
