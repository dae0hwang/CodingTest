package DFS2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 피자배달거리 {

    static class Point {
        public int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int n,m,len, answer = Integer.MAX_VALUE;
    //피자집 위치를 모아놓은 pz리스트를 바탕으로 m개의 피자집을 고르는 조합의 경우를 담는 배열
    static int[] combi;
    //먼저 주어진 board를 다 돌면서 집과 피자집의 위치를 담아놓은 리스트
    static ArrayList<Point> hs, pz;

    //조합을 구하는 DFS 설명은 DFS 활용 조합 구하기편에서 볼 수 있다.
    public static void DFS(int L, int s) {
        if (L == m) {
            //해당 조합과 집들간의 최소 위치 더한 값
            //그림으로 이해 필요
            int sum = 0;
            for (Point h : hs) {
                int dis = Integer.MAX_VALUE;
                //집하나하나와 피자집 조합 4가지 위치 비교해서 가장 작은 값 구하기 =dis
                for (int i : combi) {
                    dis = Math.min(dis, Math.abs(h.x - pz.get(i).x) + Math.abs(h.y - pz.get(i).y));
                }
                //그 값을 dis에 넣기
                sum += dis;
            }
            answer = Math.min(answer, sum);
        } else {
            //피자집 6개 중에, 4개 조합 고르는 DFS식
            for (int i = s; i < len; i++) {
                combi[L] = i;
                DFS(L+1, i+1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        //지도의 길이
        n=kb.nextInt();
        //남길 피자집의 수
        m=kb.nextInt();

        pz=new ArrayList<>();
        hs=new ArrayList<>();
        //주어진 지도를 확인하면서, pz와 hs 리스트에 위치 정보를 넣는다.
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int tmp=kb.nextInt();
                if(tmp==1) hs.add(new Point(i, j));
                else if(tmp==2) pz.add(new Point(i, j));
            }
        }
        for (Point point : hs) {
            System.out.println(point.x +"  "+ point.y);
        }

//        //피자집 len개 중에 m개 조합 고르기
//        len=pz.size();
//        //m개 조합 넣을 배열
//        combi=new int[m];
//        DFS(0, 0);
//        System.out.println(answer);
    }


}
