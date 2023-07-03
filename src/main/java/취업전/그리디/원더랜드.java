package 취업전.그리디;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 원더랜드 {

    static class Edge implements Comparable<Edge> {
        public int v1, v2, cost;

        public Edge(int v1, int v2, int cost) {
            this.v1 = v1;
            this.v2 = v2;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edge o) {
            //비용 순 오름 차순이다.
            return this.cost - o.cost;

        }
    }

    public static int Find(int v) {
        if (v == unf[v]) {
            return unf[v];
        } else {
            return unf[v] = Find(unf[v]);
        }
    }

    //a와 b를 연결시키는 메소드
    public static void Union(int a, int b) {
        int fa = Find(a);
        int fb = Find(b);
        if (fa != fb) {
            //안의 밸류 값을 같게 만들어서 연결 시킴
            unf[fa] = fb;
        }
    }

    static int[] unf;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        //연결 되었는 지 확인 할 수 있는 유니온파인드 배열 인덱스별값이 같으면 연결된 것이다.
        unf = new int[n + 1];
        for(int i=1; i<=n; i++) unf[i]=i;

        //각 점이 어떤 가중치 값으로 연결되었는 지 확인
        ArrayList<Edge> arr = new ArrayList<>();
        for(int i=0; i<m; i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            arr.add(new Edge(a, b, c));
        }
        //cost 비용이 작은 순으로 정렬한다.
        //그래서 작은 순으로 연결한 다음에, 연결이 안된 부분이 확인되면,
        Collections.sort(arr);

        int answer = 0;
        for (Edge edge : arr) {
            //union&find를 사용해서 연결되지 않은 점이 발견되면,
            //둘을 연결시키고, 가중치를 answer에 더한다.
            //그러면 최소의 가중치 값이 나온다.(cost비용을 오름차순으로 정렬 했기 때문에)
            int fv1 = Find(edge.v1);
            int fv2 = Find(edge.v2);
            if (fv1 != fv2) {
                answer += edge.cost;
                Union(edge.v1, edge.v2);

            }
        }
        System.out.println(answer);
    }
}
