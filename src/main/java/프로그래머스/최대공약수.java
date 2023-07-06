package 프로그래머스;

import java.util.Arrays;

public class 최대공약수 {

    public static void main(String[] args) {
        최대공약수 a = new 최대공약수();
        int[] solution = a.solution(2, 5);
        System.out.println(Arrays.toString(solution));
    }

    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int max = 0;
        for(int i=1; i<=n && i<=m; i++) {
            if (n % i == 0 && m % i == 0) {
                max = i;
            }
        }
        System.out.println(max);
        int min = n * m / max;
        System.out.println(min);
        answer[0] = max;
        answer[1] = min;
        return answer;
    }

}
