package 알고리즘복습;

import java.util.Scanner;

public class 연속된자연수의합 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
        }

        int lt = 0, cnt = 0, sum = 0;
        for (int rt = 0; rt <n; rt++) {
            sum += arr[rt];
            rt++;
            if (sum == n) {
                cnt++;
            }
            while (sum >= n) {
                sum -= arr[lt++];
                if (sum == n) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }

}
