package 그리디;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class 씨름선수 {

    static class Man implements Comparable<Man> {
        public int height, weight;

        public Man(int height, int weight) {
            this.height = height;
            this.weight = weight;
        }

        @Override
        public int compareTo(Man o) {
            return o.height - this.height;
        }

        @Override
        public String toString() {
            return "Man{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Man> list = new ArrayList<Man>();
        for (int i = 0; i < n; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();
            Man temp = new Man(height, weight);
            list.add(temp);
        }
        Collections.sort(list);
        for (Man man : list) {
            System.out.println(man.toString());
        }
        int height = 0;
        int weight = 0;
        int cnt = 0;
        for (Man man : list) {
            if (man.weight >= weight) {
                cnt++;
                weight = man.weight;
            }
        }
        System.out.println(cnt);
    }

}
