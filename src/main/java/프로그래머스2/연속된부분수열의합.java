package 프로그래머스2;

import java.util.Arrays;

public class 연속된부분수열의합 {

    public int[] solution(int[] sequence, int k) {
        int lt = 0;
        int n = sequence.length;
        int sum = 0;
        int[] answer = {0, n};

        //이건 연속된 자연수의 합 찾는 투포인터 공식이다.
        //rt를 처음부터 끝까지 돌리고
        for (int rt = 0; rt < n; rt++) {
            sum += sequence[rt];
            int[] temp = null;
            if (sum == k) {
                temp = new int[]{lt, rt};
                int answerDis = answer[1] - answer[0];
                int tempDis = temp[1] - temp[0];
                if (tempDis < answerDis) {
                    answer = temp;
                }
            }
            //주어진 값보다 커지면 lt 위치를 배고 lt++를 진행한다.
            while (sum >= k) {
                sum -= sequence[lt++];
                if (sum == k) {
                    temp = new int[]{lt, rt};
                    int answerDis = answer[1] - answer[0];
                    int tempDis = temp[1] - temp[0];
                    if (tempDis < answerDis) {
                        answer = temp;
                    }
                }
            }
        }
        return answer;
    }
    //이건 테스트용
    public static void main(String[] args) {
        int[] sequence = {1, 1, 1, 2, 3, 4, 5};
        int k = 5;
        int lt = 0;
        int n = sequence.length;
        int sum = 0;
        int[] answer = {0, Integer.MAX_VALUE};
        for (int rt = 0; rt < n; rt++) {
            sum += sequence[rt];
            int[] temp = null;
            if (sum == k) {
                System.out.println("lt= " + lt + " rt= "+ rt);
                temp = new int[]{lt, rt};
                int answerDis = answer[1] - answer[0];
                int tempDis = temp[1] - temp[0];
                if (tempDis < answerDis) {
                    answer = temp;
                }
            }
            while (sum >= k) {
                sum -= sequence[lt++];
                if (sum == k) {
                    System.out.println("lt= " + lt + " rt= "+ rt);
                    temp = new int[]{lt, rt};
                    int answerDis = answer[1] - answer[0];
                    int tempDis = temp[1] - temp[0];
                    if (tempDis < answerDis) {
                        answer = temp;
                    }
                    }
                }
            }
        System.out.println(Arrays.toString(answer));
    }
}
