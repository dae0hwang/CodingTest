package 취업전.배열;

import java.util.Arrays;
import java.util.Scanner;

public class 소수_에라토스테네스체 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //배열에 n값이 나오면

        int[] arr = new int[n + 1];
        arr[0] = -1;
        int answer = 0;
        for (int i = 2; i <= n; i++) {
            if (arr[i] == 0) {
                answer++;
                for (int j = 1; j <= n/i; j++) {
                    arr[i * j] = 1;
                }
            }
//            System.out.println(i);
//            System.out.println(Arrays.toString(arr));
        }
        System.out.println(answer);
    }

}
