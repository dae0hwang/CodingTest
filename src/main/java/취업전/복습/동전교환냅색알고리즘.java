package 취업전.복습;

import java.util.Arrays;
import java.util.Scanner;

public class 동전교환냅색알고리즘 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //거스름돈 동전 모아두는 arr
        int[] coin = new int[n];
        for (int i = 0; i < n; i++) {
            coin[i] = sc.nextInt();
        }
        //거슬러 줄 값
        int m = sc.nextInt();

        //거슬러 줄 값 인덱스까지 최소 거스름 돈 개수 저장 dy arr 생성
        int[] dy = new int[m + 1];
        Arrays.fill(dy, Integer.MAX_VALUE);
        //0원 거슬러 줄 가장 작은 수는 0개이다.
        dy[0] = 0;

        for (int i = 0; i < n; i++) {
            for (int j = coin[i]; j <=m; j++) {
                dy[j] = Math.min(dy[j], dy[j - coin[i]] + 1);
            }
        }
    }

}
