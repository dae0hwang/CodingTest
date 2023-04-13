package 배열;

import java.util.Scanner;

public class 점수계산 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int nextInt = sc.nextInt();
            arr[i] = nextInt;
        }

        int cnt = 0;
        int answer = 0;
        for (int i : arr) {
            if (i == 1) {
                cnt++;
                answer += cnt;
            } else {
                cnt = 0;
            }
        }
        System.out.println(answer);
    }

}
