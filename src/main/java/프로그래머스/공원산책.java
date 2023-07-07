package 프로그래머스;

import java.util.Arrays;
import 프로그래머스.나누어.S;

public class 공원산책 {


    public static void main(String[] args) {
        공원산책 a = new 공원산책();
        int[] solution = a.solution(new String[]{"OSO","OOO","OXO","OOO"},
            new String[]{"E 2","S 3","W 1"});
        System.out.println(Arrays.toString(solution));
    }

    static class Point {
        int x , y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
        }
    }

    static int[][] arr;
    static int a;
    static Point start;

    public int[] solution(String[] park, String[] routes) {
        int w = park.length;
        int h = park[0].length();
//        System.out.println("w = " + w);
//        System.out.println("h = " + h);
        arr = new int[w][h];
        for (int i = 0; i < w; i++) {
            String s = park[i];
            for (int j = 0; j < h; j++) {
                String[] split = s.split("");
                if (split[j].equals("S")) {
                    arr[i][j] = 0;
                    start = new Point(i, j);
                } else if (split[j].equals("O")) {
                    arr[i][j] = 0;
                } else {
                    arr[i][j] = 1;
                }
            }
        }
//        System.out.println(Arrays.deepToString(arr));
        //arr 만들기까지 완성
        for (String route : routes) {
            String[] split = route.split(" ");
            String dir = split[0];
            int n = Integer.valueOf(split[1]);
            //동 서 남 북
            int x = start.x;
            int y = start.y;
            int tempX = 0;
            int tempY = 0;
            boolean flag = true;
            if (dir.equals("E")) {
                tempX = start.x;
                tempY = start.y + n;
//                System.out.println("x = " + x);
//                System.out.println("y = " + y);
//                System.out.println("tempX = " + tempX);
//                System.out.println("tempY = " + tempY);
                if (tempX >= 0 && tempX < w && tempY >= 0 && tempY < h) {
                    for (int i = y; i <= tempY; i++) {
                        if (arr[x][i] == 1) {
                            flag = false;
                        }
                    }
                } else {
                    flag = false;
                }

            } else if (dir.equals("W")) {
                tempX = start.x;
                tempY = start.y - n;
                if (tempX >= 0 && tempX < w && tempY >= 0 && tempY < h) {
                    for (int i = tempY; i <= y; i++) {
                        if (arr[x][i] == 1) {
                            flag = false;
                        }
                    }
                } else {
                    flag = false;
                }


            } else if (dir.equals("S")) {
                tempX = start.x + n;
                tempY = start.y;
                if (tempX >= 0 && tempX < w && tempY >= 0 && tempY < h) {
                    for (int i = x; i <= tempX; i++) {
                        if (arr[i][y] == 1) {
                            flag = false;
                        }
                    }
                } else {
                    flag = false;
                }

            } else {
                tempX = start.x - n;
                tempY = start.y;
                if (tempX >= 0 && tempX < w && tempY >= 0 && tempY < h) {
                    for (int i = tempX; i <= x; i++) {
                        if (arr[i][y] == 1) {
                            flag = false;
                        }
                    }
                } else {
                    flag = false;
                }
            }
            if (flag) {
                //참일 때만
                start.x = tempX;
                start.y = tempY;
            }

        }
        int[] answer = new int[2];
        answer[0] = start.x;
        answer[1] = start.y;
        return answer;
    }
}
