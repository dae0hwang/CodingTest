package 취업전.프로그래머스L1;

public class 바탕화면정리 {

    public int[] solution(String[] wallpaper) {
        int minRow, minCol, maxRow, maxCol;
        minRow = minCol = Integer.MAX_VALUE;
        maxRow = maxCol = Integer.MIN_VALUE;
        int row = wallpaper.length;
        int col = wallpaper[0].length();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    minRow = Math.min(minRow, i);
                }
            }
        }
        

        int[] answer = {};
        return answer;
    }

}

