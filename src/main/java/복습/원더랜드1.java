package 복습;

import java.util.ArrayList;
import java.util.Scanner;

public class 원더랜드1 {

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

    }


}
