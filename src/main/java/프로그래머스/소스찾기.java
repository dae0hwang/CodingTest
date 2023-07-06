package 프로그래머스;

import java.lang.reflect.Array;
import java.util.Arrays;

public class 소스찾기 {

    public static void main(String[] args) {
        소스찾기 s = new 소스찾기();
        int solution = s.solution(5);
        System.out.println(solution);
    }

    public int solution(int n) {
        int answer = 0;
        int[] number = new int[n + 1];
        for(int i=2; i<=n; i++) {
            number[i] = i;
        }
        for (int i = 2; i <= n; i++) {
            if (number[i] == 0) {
                continue;
            }
            for (int j = 2 * i; j <= n; j += i) {
                number[j] = 0;
            }
        }
        for(int i=0; i<number.length; i++) {
            if(number[i]!=0) {
                answer++;
            }
        }


        return answer;
    }

    public static boolean isPrime(int a) {
        //절반 나누어서 확인
        int mid = a / 2+1;
        for (int i = 2; i <= mid; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
