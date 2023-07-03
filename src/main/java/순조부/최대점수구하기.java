package 순조부;

import java.util.Scanner;
import 취업전.복습하기.DFS;

class A {

    int t, s;

    public A(int time, int score) {
        this.t = time;
        this.s = score;
    }
}

public class 최대점수구하기 {

    static int n;
    static int time;
    static int answer = Integer.MIN_VALUE;
    static A[] arr;

    public static void DFS(int v, int sumS, int sumT) {
        if (v == n) {
            //모든 경우의 수가 여기 모인다.
            if (sumT <= time) {
                answer = Math.max(sumS, answer);
            }
        } else {
            DFS(v + 1, sumS + arr[v].s, sumT + arr[v].t);
            DFS(v + 1, sumS, sumT);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        time = sc.nextInt();
        arr = new A[n];
        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int t = sc.nextInt();
            arr[i] = new A(t, s);
        }
        DFS(0, 0, 0);
        System.out.println(answer);
    }
}
