package 알고리즘복습;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
class Tim implements Comparable<Tim>{

    int time;
    char  state;

    public Tim(int time, char  state) {
        this.time = time;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Tim{" +
            "time=" + time +
            ", state='" + state + '\'' +
            '}';
    }

    @Override
    public int compareTo(Tim o) {
        if(this.time==o.time) return this.state-o.state;
        else return this.time-o.time;
    }
}

public class 결혼식 {

    static int n;
    static List<Tim> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            list.add(new Tim(start, 's'));
            int end = sc.nextInt();
            list.add(new Tim(end, 'e'));
        }
        Collections.sort(list);
        for (Tim tim : list) {
            System.out.println(tim);
        }
        int cnt = 0;
        int answer = 0;
        for (Tim tim : list) {
            if (tim.state=='s') {
                cnt++;
            } else {
                cnt--;
            }
            answer = Math.max(cnt, answer);
        }
        System.out.println(answer);
    }
}
