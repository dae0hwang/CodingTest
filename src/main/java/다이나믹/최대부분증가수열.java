package 다이나믹;

import java.util.Scanner;

public class 최대부분증가수열 {

    public static int solution(int[] arr) {
        int answer = 0;
        int[] dy = new int[arr.length];
        dy[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            int max = 0;
            for (int j = i; j >= 0; j--) {
                //본인 보다 앞에 있는 수중에 dy값이 제일 큰것을 고르기
                if (arr[j] < arr[i] && dy[j] > max) {
                    max = dy[j];
                }
                dy[i] = max + 1;
                answer = Math.max(answer, dy[i]);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(arr));
    }

}
