package 그리디;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 원더랜드우선순위큐 {

    static class edge implements Comparable<edge> {
        public int vex, cost;

        public edge(int vex, int cost) {
            this.vex = vex;
            this.cost = cost;
        }
        @Override
        public int compareTo(edge o) {
            return this.cost - o.cost;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<ArrayList<edge>> graph = new ArrayList<ArrayList<edge>>();
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<edge>());
        }
        int[] ch=new int[n+1];
        for(int i=0; i<m; i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            graph.get(a).add(new edge(b, c));
            graph.get(b).add(new edge(a, c));
        }

        int answer=0;
        PriorityQueue<edge> pQ = new PriorityQueue<>();
        pQ.offer(new edge(1, 0));
        while(!pQ.isEmpty()){
            edge tmp=pQ.poll();
            int ev=tmp.vex;
            if(ch[ev]==0){
                ch[ev]=1;
                answer+=tmp.cost;
                for(edge ob : graph.get(ev)){
                    if(ch[ob.vex]==0) pQ.offer(new edge(ob.vex, ob.cost));
                }
            }
        }
        System.out.println(answer);
    }
}
