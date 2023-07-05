package 알고리즘복습;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 가장높은탑쌓기 {

    static class Brick implements Comparable<Brick>{
        int s, h, w;

        public Brick(int s, int h, int w) {
            this.s = s;
            this.h = h;
            this.w = w;
        }

        @Override
        public String toString() {
            return "Brick{" +
                "s=" + s +
                ", h=" + h +
                ", w=" + w +
                '}';
        }

        @Override
        public int compareTo(Brick o) {
            return o.s - this.s;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Brick> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int h = sc.nextInt();
            int w = sc.nextInt();
            list.add(new Brick(s, h, w));
        }
        Collections.sort(list);
        //밑변의 넓이가 큰 순으로
        int answer = 0;
        int[] dy = new int[n];
        dy[0] = list.get(0).h;
        for (int i = 1; i < n; i++) {
            int max = 0;
            //이제 자신보다 뒤에 있는 것중에 무게가 낮고 높이가 가장 큰것 고르기
            for (int j = 0; j < i; j++) {
                if (dy[j] > max && list.get(i).w < list.get(j).w) {
                    max = dy[j];
                }
                dy[i] = max+list.get(i).h;
                answer = Math.max(dy[i], answer);
            }
        }
        System.out.println(answer);
    }
}
