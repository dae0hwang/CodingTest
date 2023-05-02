package 복습;

import java.util.Arrays;
import java.util.Scanner;

public class 등수구하기2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 0; j < n; j++) {
                if (arr[i] < arr[j]) {
                    cnt++;
                }
            }
            answer[i] = cnt;
        }
        System.out.println(Arrays.toString(answer));
    }

}
