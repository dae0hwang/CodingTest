package 배열;

import java.util.Arrays;
import java.util.Scanner;

public class 멘토링 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int num = sc.nextInt();
                arr[j][i] = num;
            }
        }
        System.out.println(Arrays.deepToString(arr));
        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true;
                System.out.println(i +" "+ j);
                for (int k = 0; k < m; k++) {
//                    System.out.print(k+" ");
                    if (arr[i][k] <= arr[j][k]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    answer++;
                }
            }
        }
        System.out.println(answer);

    }

}
