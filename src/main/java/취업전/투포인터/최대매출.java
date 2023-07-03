package 취업전.투포인터;

import java.util.Scanner;

public class 최대매출 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        int answer = Integer.MIN_VALUE;
        for (int i = 1; i <= n-m; i++) {
            int sum = arr[i] + arr[i + 1] + arr[i + 2];
            answer = Math.max(answer, sum);

        }

        System.out.println(answer);

    }

}
