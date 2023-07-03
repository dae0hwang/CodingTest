package 취업전.투포인터;

import java.util.Map;
import java.util.Scanner;

public class 최대길이연속부분수열 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int answer = solution(n, k, arr);
        System.out.println(answer);
    }

    static int solution(int n, int k, int[] arr) {
        //cnt는 0을 1로 바꾼 수 k보다 커지면,
        // lt가 0을 만날 때까지 lt를 앞으로 옮긴다
        int answer = 0, cnt = 0, lt = 0;
        //rt가 0부터 끝까지 전진
        for (int rt = 0; rt < n; rt++) {
            //가는 도중에 0을 만나면 1로 바꾼다고 생각하고 cnt++를 한다.
            if (arr[rt] == 0) {
                cnt++;
            }
            while (cnt > k) {
                if (arr[lt] == 0) {
                    cnt--;
                }
                //lt위치가 0일 때까지 찾는다!!
                lt++;
            }
            answer = Math.max(answer, rt - lt + 1);
        }
        return answer;
    }
}
