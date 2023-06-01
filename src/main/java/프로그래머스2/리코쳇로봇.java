package 프로그래머스2;

import java.util.Arrays;

public class 리코쳇로봇 {

    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {1, 0, -1, 0};
    public static int answer = Integer.MAX_VALUE;
    public static int[][] realBoard;

    public static int gx = 0, gy = 0;
    public static int sx = 0, sy = 0;
    public int solution(String[] board) {
        int answer = 0;
        //R의 위치를 찾긴 해야해


        return answer;
    }

    public static void main(String[] args) {
        String[] board = {"...D..R", ".D.G...", "....D.D", "D....D.", "..D...."};
        realBoard = new int[board.length][board[0].length()];

        for (int i = 0; i < board.length; i++) {
            String s = board[i];
            int length = s.length();
            String[] split = s.split("");
            for (int j = 0; j < split.length; j++) {
                if (split[j].equals(".")) {
                    realBoard[i][j] = 0;
                } else if (split[j].equals("D")) {
                    realBoard[i][j] = 1;
                } else if (split[j].equals("R")) {
                    realBoard[i][j] = -1;
                    sx = i;
                    sy = j;
                } else if (split[j].equals("G")) {
                    realBoard[i][j] = 2;
                    gx = i;
                    gy = j;
                }
            }
        }
        for (int[] ints : realBoard) {
            System.out.println(Arrays.toString(ints));
        }

        DFS(sx, sy, 0);
        System.out.println(answer);


    }

    //최소 움직임
    public static void DFS(int x, int y, int count) {
        if (x == gx && y == gy) {
            answer = Math.min(answer, count);
        } else {
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 0 && nx < realBoard.length && ny >= 0 && ny < realBoard[0].length
                    && realBoard[nx][ny] != 1) {
                    realBoard[nx][ny] = 1;
                    DFS(nx, ny, count + 1);
                    realBoard[nx][ny] = 0;

                }
            }
        }
    }
}
