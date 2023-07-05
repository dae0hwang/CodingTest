package 알고리즘복습;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class A implements Comparable<A> {
    int score, index, number;

    public A(int score, int index, int number) {
        this.score = score;
        this.index = index;
        this.number = number;
    }

    @Override
    public String toString() {
        return "A{" +
            "score=" + score +
            ", index=" + index +
            ", number=" + number +
            '}';
    }

    @Override
    public int compareTo(A o) {
        return o.score - this.score;
    }
}

public class 등수구하기 {

    static int n;
    static int[] arr;
    static List<A> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            list.add(new A(sc.nextInt(), i, 0));
        }
        Collections.sort(list);
        for (A a : list) {
            System.out.println(a);
        }
        //같은 것을 생각해야한다.

        int count = 1;
        int bonus = 0;
        int past = 0;
        for (A a : list) {
            if (past == a.score) {
                bonus++;
                a.number = count;
            } else {
                count = count + bonus;
                bonus = 0;
                a.number = count;
                bonus++;
            }
            past = a.score;
        }
        for (A a : list) {
            System.out.println(a);
        }

        for (A a : list) {
            arr[a.index] = a.number;
        }
        System.out.println(Arrays.toString(arr));
    }
}
