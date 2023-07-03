package 취업전.그래프와인접행렬;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 그래프최단거리 {

//    static int n, m;
//    static ArrayList<ArrayList<Integer>> graph;
//    static int[] answer, ch;
//
//    public static void BFS(int n) {
//        int L = 1;
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(n);
//
//        while (!queue.isEmpty()) {
//            int len = queue.size();
//            for (int i = 0; i < len; i++) {
//                Integer cv = queue.poll();
//                for (Integer nv : graph.get(cv)) {
//                    queue.add(nv);
//                    if (answer[nv] == 0 && ch[nv] == 0) {
//                        ch[nv] = 1;
//                        answer[nv] = L;
//                    }
//                }
//            }
//            L++;
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        m = sc.nextInt();
//        //인덱스가 1부터 접접 의미 그 값에 1노드와 최소한 떨어진 수를 넣는다.
//        answer = new int[n + 1];
//        //최고 값을 미리 넣어두자
////        for (int i = 0; i < answer.length; i++) {
////            answer[i] = Integer.MAX_VALUE;
////        }
//        answer[0] = -1;
//        answer[1] = -1;
//        ch=new int[n+1];
//        ch[0] = 1;
//        ch[1] = 1;
//        graph = new ArrayList<>();
//        for (int i = 0; i <= n; i++) {
//            graph.add(new ArrayList<Integer>());
//        }
//        for (int i = 0; i < m; i++) {
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            graph.get(a).add(b);
//        }
//
//        System.out.println(graph);
//        //graph 까지는 오케이
//
//        //ch로 갈 필요 자체가 없구나 ㅇㅇ
//        BFS(1);
////        System.out.println(Arrays.toString(answer));
//
//    }
static int n, m;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch, dis;

    public static void BFS(int v) {
        ch[v] = 1;
        dis[v] = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);
        while (!queue.isEmpty()) {
            int cv = queue.poll();
            for (Integer nv : graph.get(1)) {
                if (ch[nv] == 0) {
                    ch[nv] = 1;
                    queue.offer(nv);
                    dis[nv] = dis[cv] + 1;
                }
            }
        }
    }


    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt();
        m=kb.nextInt();
        graph=new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<Integer>());
        }
        ch=new int[n+1];
        dis=new int[n+1]; //여기 배열 인덱스별로 거리를 담는다.
        for(int i=0; i<m; i++){
            int a=kb.nextInt();
            int b=kb.nextInt();
            graph.get(a).add(b);
        }
        BFS(1);
        for(int i=2; i<=n; i++){
            System.out.println(i+" : "+dis[i]);
        }
    }

}
