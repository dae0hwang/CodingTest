package 취업전.배열;

import java.util.Scanner;

public class 보이는학생 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int big = 0;
        int answer = 0;
        for (int i : arr) {
            if (i > big) {
                answer++;
                big = i;
            }
        }

        System.out.println(answer);

    }

}
