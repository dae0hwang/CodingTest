package 프로그래머스;

import java.util.Arrays;

public class 크기작 {

    public static void main(String[] args) {
        크기작 a = new 크기작();
        a.solution(new String[]{".#...", "..#..", "...#."});
    }

    public int[] solution(String[] wallpaper) {
        int w = wallpaper.length;
        int h = wallpaper[0].length();
        int[][] arr = new int[w][h];
        for (int i = 0; i < w; i++) {
            String[] split = wallpaper[i].split("");
            for (int j = 0; j < j; j++) {
                if (split[j].equals("#")) {
                    arr[i][j] = 1;
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));


        int[] answer = {};
        return answer;
    }
}
