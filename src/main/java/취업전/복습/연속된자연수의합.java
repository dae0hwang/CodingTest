package 취업전.복습;

import java.util.Arrays;
import java.util.Scanner;

public class 연속된자연수의합 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num = n / 2 + 1;
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));

        //8개이다.

        int lt = 0, answer = 0, sum = 0;
        for (int rt = 0; rt < num; rt++) {
            sum += arr[rt];
            if (sum == n) {
                answer++;
            }

            while (sum >= n) {
                sum -= arr[lt++];
                if (sum == n) {
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}
