package 알고리즘복습;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Man implements Comparable<Man>{
    int h, w;

    public Man(int h, int w) {
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Man o) {
        return o.h-this.h;
    }

    @Override
    public String toString() {
        return "Man{" +
            "h=" + h +
            ", w=" + w +
            '}';
    }
}
public class 씨름선수 {

    static int n;
    static List<Man> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            list.add(new Man(h, w));
        }
        Collections.sort(list);
        for (Man man : list) {
            System.out.println(man);
        }

        int maxW = Integer.MIN_VALUE;
        int answer = 0;
        for (Man man : list) {
            if (man.w > maxW) {
                answer++;
                maxW = man.w;
            }
        }
        System.out.println(answer);



    }

}
