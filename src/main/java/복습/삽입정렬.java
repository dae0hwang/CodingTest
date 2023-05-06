package 복습;

import java.util.Arrays;
import java.util.Scanner;

public class 삽입정렬 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //삽입 정렬 시작
        for (int i = 1; i <= n; i++) {
            int tmp = arr[i], j;
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[j + 1]) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = tmp;
        }


        for(int i=1; i<n; i++) {
            int tmp = arr[i], j;
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > tmp)
                    arr[j + 1] = arr[j];
                else
                    break;
            }
            arr[j + 1] = tmp;
        }
        System.out.println(Arrays.toString(arr));
    }

}
