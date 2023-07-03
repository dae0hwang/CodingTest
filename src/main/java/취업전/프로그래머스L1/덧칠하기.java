package 취업전.프로그래머스L1;

public class 덧칠하기 {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int maxPaint = 0, paintCnt = 0;
        for (int point : section) {
            if (maxPaint < point) {
                maxPaint = point + m-1;
                paintCnt++;
            }
        }



        return paintCnt;
    }

}
