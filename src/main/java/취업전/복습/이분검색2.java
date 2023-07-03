package 취업전.복습;

import java.util.Arrays;
import java.util.Scanner;

public class 이분검색2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int answer = 0;
        int lt = 0;
        int rt = arr.length;
        while (lt <= rt) {
            //lt가 커지는 순간 끝이다
            int mid = (lt + rt) / 2;
            if (arr[mid] > k) {
                rt = mid;
            } else if (arr[mid] < k) {
                lt = mid;
            } else {

                answer = mid + 1;
                break;
            }
        }
        System.out.println(answer);
    }

}
