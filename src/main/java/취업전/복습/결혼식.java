package 취업전.복습;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 결혼식 {

    static class Time implements Comparable<Time> {


        int time;
        String s;

        public Time(int time, String s) {
            this.time = time;
            this.s = s;
        }

        @Override
        public int compareTo(Time o) {
            return this.time - o.time;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Time> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            list.add(new Time(a, "s"));
            list.add(new Time(b, "e"));
        }
        Collections.sort(list);

        int cnt = 0;
        int answer = 0;
        for (Time time : list) {
            if (time.s.equals("s")) {
                cnt++;
            } else {
                cnt--;
            }
            answer = Math.max(answer, cnt);

        }
        System.out.println(answer);
    }
}
