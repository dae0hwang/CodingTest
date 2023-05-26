package 프로그래머스2;

import java.util.Arrays;

public class 요격시스템 {
    public static int solution(int[][] targets) {
        int answer = 0;

        //끝나는 지점 오름 차순 정렬 하고
        //->[[1, 4], [4, 5], [3, 7], [4, 8], [5, 12], [11, 13], [10, 14]]
        Arrays.sort(targets, ((o1, o2) -> {
            return o1[1] - o2[1];}));
        int last = -1;
        //첫번째 target부터 순회하면서
        for (int[] target : targets) {
            //처음일 경우 끝점을 taget 끝나는 지점 -1로 설정한다.
            if (last == -1) {
                answer++;
                last = target[1] - 1;
                continue;
            }
            //끝점안에 포함된 taget인 경우 answer++하지 않고 그냥 넘어간다.
            if (last >= target[0] && last <= target[1]) {
                continue;
            }
            //포함되지 않은 target일 경우 +1 한 이후 끝점을 해당 타겟 끝점-1로 변경한다.
            answer++;
            last = target[1] - 1;
        }
        return answer;
    }
}
