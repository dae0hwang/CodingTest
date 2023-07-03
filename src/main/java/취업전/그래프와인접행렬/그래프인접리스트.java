package 취업전.그래프와인접행렬;

import java.util.ArrayList;
import java.util.Scanner;

public class 그래프인접리스트 {
    static int n, m , answer = 0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;

    static void DFS(int v) {
        if (v == n) {
            answer++;
        } else {
            for (Integer nv : graph.get(v)) {
                //DFS(1)을 예를 들면 graph.get(1) = 1에 갈수 있는 노드 nv = 2,3,4 이다.
                if (ch[nv] == 0) {
                    //가려고 하는 접점이 0이라면, 거치지 않았던 곳이라면,
                    //갔다는 표시를 하고
                    ch[nv] = 1;
                    //해당 접정을 DFS 실행
                    DFS(nv);
                    //끝나면 거쳤다는 표시를 삭제
                    ch[nv] = 0;

                    //그리고 다시 DFS(1) 에서 갈 수 있는 접점 nv => 3을 실행한다. (nv =2 가 끝나면)
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        ch = new int[n + 1];

        //인접 리스트 인덱스 리스트가 노드가 되고, 인덱스 리스트 안에 있는 Integer들이 노드에서 갈 수 있는 접점들이다.
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        ch[1] = 1;
        DFS(1);
        System.out.println(answer);
    }

}
