package 프로그래머스;

import java.util.Arrays;

public class 예산2 {
    public static void main(String[] args) {
        예산2 a = new 예산2();
        a.solution(new int[]{1, 3, 2, 5, 4}, 9);
    }
    public int solution(int[] d, int budget) {
        //정렬한 후에 작은 순으로 해보자
        Arrays.sort(d);
//        System.out.println(Arrays.toString(d));
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int lt = 0;
        for (int rt = 0; rt < d.length; rt++) {
            sum += d[rt];
            if (sum <= budget) {
                max = Math.max(max, rt - lt + 1);
            }
            while (sum > budget) {
                sum -= d[lt];
                lt++;
                if (sum <= budget) {
                    max = Math.max(max, rt - lt + 1);
                }
            }
        }
        return max;
    }
}
