package 취업전.배열;

import java.util.Arrays;
import java.util.Scanner;

public class 피보나치수열 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == 2) {
                arr[i] = 1;
            } else {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
        }

        System.out.println(Arrays.toString(arr));
    }

}
