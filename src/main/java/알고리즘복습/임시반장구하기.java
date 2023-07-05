package 알고리즘복습;

import java.util.Arrays;
import java.util.Scanner;

public class 임시반장구하기 {

    static int n;
    static int[][] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n+1][6]; //1반부터 5반까지
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < 5+1; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        //비교를 해봐야 하는데
        int[] answer = new int[n + 1];
        for (int i = 1; i < n+1; i++) {
            int cnt = 0;
            for (int j = 1; j < 6; j++) {
                for (int k = 1; k <= 5; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            answer[i] = cnt;
        }

        System.out.println(Arrays.toString(answer));
    }

}
