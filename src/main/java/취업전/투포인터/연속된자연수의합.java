package 취업전.투포인터;

import java.util.Scanner;

public class 연속된자연수의합 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        System.out.print(solution(n));
    }

    public static int solution(int n) {
        int answer = 0, sum = 0;
        int m = n / 2 + 1;
        int[] arr = new int[m];
        for(int i=0; i<m; i++) arr[i]=i+1;
        int lt = 0;

        for (int rt = 0; rt < m; rt++) {
            sum += arr[rt];
            if (sum == n) {
                answer++;
            }
            //sum이 목표값보다 크면 lt위치 값을 빼고, lt를 한칸 전진한다.
            while (sum >= n) {
                sum -= arr[lt++];
                if (sum == n) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
