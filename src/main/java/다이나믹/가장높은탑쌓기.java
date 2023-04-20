package 다이나믹;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 가장높은탑쌓기 {

    static class Brick implements Comparable<Brick> {
        public int s, h, w;

        public Brick(int s, int h, int w) {
            this.s = s;
            this.h = h;
            this.w = w;
        }

        @Override
        public int compareTo(Brick o) {
            //밑변 넓이로 내림차순 정렬
            //이제 앞과 무게만 비교해서,
            //쌓을 수 있는 지 없는 지확인하면된다.
            return o.s - this.s;
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        ArrayList<Brick> arr=new ArrayList<>();
        //dy[]에는 인덱스별로 쌓을 수 있는 최대 높이가 들어간다.
        int[] dy=new int[n];
        for(int i=0; i<n; i++){
            int a=kb.nextInt();
            int b=kb.nextInt();
            int c=kb.nextInt();
            arr.add(new Brick(a, b, c));
        }

        //풀이하기
        //먼저 밑변 내림차순으로 정렬 25 -> 16 -> 9 ...
        Collections.sort(arr);
        //밑에 깔릴 것이 없는 arr.get(0)은 먼저 dy설정
        dy[0]=arr.get(0).h;
        //가장 높은 값 저장하는 answer
        int answer=dy[0];


        for(int i=1; i<arr.size(); i++){
            int max_h=0;
            //자신 보다 앞에 있고 무게가 큰 것 중에 높이가 제일 큰 것 선택해서
            //자신의 높이 더해서 최대 높이 길이 구하기!!
            for(int j=i-1; j>=0; j--){
                if(arr.get(j).w > arr.get(i).w && dy[j]>max_h){
                    max_h=dy[j];
                }
            }
            dy[i]=max_h+arr.get(i).h;
            answer=Math.max(answer, dy[i]);
        }
        System.out.println(answer);
    }
}
