package 취업전.투포인터;

import java.util.Scanner;

public class 연속된자연수의합수학방법 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;
        //풀이
        int m = n / 2 + 1;
        for (int i = 2; i <= m; i++) {
            int temp = n;
            // 2개부터 8개까지 쪼개지는 지 확인하기
            for (int j = 1; j <= i; j++) {
                temp -= j;
            }
            if (temp>=0 &&temp % i == 0) {
                System.out.println(i);
                answer++;
            }


        }

        System.out.println(answer);
    }

}
