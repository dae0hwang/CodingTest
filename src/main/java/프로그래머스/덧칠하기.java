package 프로그래머스;

public class 덧칠하기 {

    public static void main(String[] args) {

    }

    static int N, M;
    public int solution(int n, int m, int[] section) {
        int answer = 0;

        int maxPaint = 0, paintCnt = 0;
        for (int point : section) {
            if (maxPaint < point) {
                maxPaint = point + m - 1;
                paintCnt++;
            }
        }
        return paintCnt;
    }
}
