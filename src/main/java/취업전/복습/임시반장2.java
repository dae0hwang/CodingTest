package 취업전.복습;

import java.util.Arrays;
import java.util.Scanner;

public class 임시반장2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] answer = new int[n];
        //각 인덱스(학생)마다 각 학년에 몇반을 햇는지 나타내는 board 만들기
        int[][] board = new int[n][5];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                board[i][j] = sc.nextInt();
            }
        }
//        System.out.println(Arrays.deepToString(board));
        for (int i = 0; i < n; i++) {
            //몇명과 같은 반 했는 지 확인
            int cnt = 0;
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < n; k++) {
                    if (board[i][j] == board[j][k]) {
                        cnt++;
                    }
                }
            }
            answer[i] = cnt;
        }
    }

}
