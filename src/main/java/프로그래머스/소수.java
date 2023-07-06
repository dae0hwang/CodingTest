package 프로그래머스;

import java.util.Arrays;

public class 소수 {

    public static void main(String[] args) {
        소수 a = new 소수();
        int solution = a.solution(new int[]{1, 2, 7, 6, 4});
        System.out.println(solution);
    }

    static int answer;
    static int[] arr;
    static int[] dis = new int[3];
    public int solution(int[] nums) {
        answer = 0;
        arr = nums;
        DFS(0, 0);
        return answer;
    }

    public static void DFS(int L, int s) {
        if (L == 3) {
            //여기서 prime인지 확인
//            System.out.println(Arrays.toString(dis));
            int sum = Arrays.stream(dis).sum();
//            System.out.println(sum);
            if (isPrime(sum)) {
//                System.out.println(sum);
                answer++;
            }

        } else {
            for (int i = s; i < arr.length; i++) {
                dis[L] = arr[i];
                DFS(L + 1, i+1);
            }
        }
    }

    public static boolean isPrime(int n) {
        boolean flag = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = false;
            }
        }
        return flag;
    }

}
