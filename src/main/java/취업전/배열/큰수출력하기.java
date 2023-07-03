package 취업전.배열;

import java.util.Arrays;
import java.util.Scanner;

public class 큰수출력하기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println(Arrays.toString(arr));

        int pre = 0;

        String answer = "";
        for (int i : arr) {
            if (i > pre) {
                answer += i+" ";
            }
            pre = i;
        }
        System.out.println(answer);
    }

}
