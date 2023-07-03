package 취업전.다이나믹;

import java.util.Scanner;

public class 계단오르기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1칸 - 1개
        //2칸 - 2개
        //3칸 - 3개
        //4칸 - 5개
        //5칸 - 8개
        //6칸 - 13개
        //7칸 - 21개
        //작은 칸수부터 값을 구해보니 피보나치 규칙이 발견되는 것을 알 수있다.
        //다이나믹 dy[] 배열에 작은 수부터 값을 넣어 목표 값을 찾는 풀이를 해보자.

        int n = sc.nextInt();
        int[] dy = new int[n+1];
        dy[1] = 1;
        dy[2] = 2;
        for (int i = 3; i <= n; i++) {
            dy[i] = dy[i - 1] + dy[i - 2];
        }
        System.out.println(dy[n]);
    }

}
