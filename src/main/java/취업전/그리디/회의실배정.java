package 취업전.그리디;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 회의실배정 {

    static class C implements Comparable<C>{
        int st, ed;

        public C(int st, int ed) {
            this.st = st;
            this.ed = ed;
        }

        @Override
        public String toString() {
            return "C{" +
                "st=" + st +
                ", ed=" + ed +
                '}';
        }

        @Override
        public int compareTo(C o) {
            if (this.ed == o.ed) {
                return this.st - o.st;
            } else {
                return this.ed - o.ed;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<C> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int st = sc.nextInt();
            int ed = sc.nextInt();
            list.add(new C(st, ed));
        }

        Collections.sort(list);

        for (C c : list) {
            System.out.println(c.toString());
        }

        int start = 0;
        int end = 0;
        int answer = 0;
        for (C c : list) {
            if (end <= c.st) {
                answer++;
                end = c.ed;
            }
        }
        System.out.println(answer);
    }

}
