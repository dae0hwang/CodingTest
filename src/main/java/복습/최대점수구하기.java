package 복습;

import java.util.Scanner;

public class 최대점수구하기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] dy = new int[m + 1];
        for (int i = 0; i < n; i++) {
            int ps = sc.nextInt(); //10점
            int pt = sc.nextInt(); //5분
            for (int j = m; j >=pt ; j--) {
                dy[j] = Math.max(dy[j], dy[j - pt] + ps);
            }
        }
    }

}
