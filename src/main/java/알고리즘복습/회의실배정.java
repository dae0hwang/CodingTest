package 알고리즘복습;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Time implements Comparable<Time>{
    int start, end;

    public Time(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "Time{" +
            "start=" + start +
            ", end=" + end +
            '}';
    }

    @Override
    public int compareTo(Time o) {
        if (this.end == o.end) {
            return this.start - o.start;
        } else {
            return this.end - o.end;
        }

    }
}
public class 회의실배정 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Time> list = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            list.add(new Time(s, e));
        }
        Collections.sort(list);
        for (Time time : list) {
            System.out.println(time);
        }
        int endTime = Integer.MIN_VALUE;
        int cnt = 0;
        for (Time time : list) {
            if (endTime <= time.start) {
                cnt++;
                endTime = time.end;
            }
        }
        System.out.println(cnt);

    }
}
