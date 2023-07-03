package 취업전.정렬;

import java.util.Arrays;
import java.util.Scanner;

public class 좌표정렬 {

    static class Point implements Comparable<Point> {
        public int x, y;

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

        @Override
        public int compareTo(Point o) {
            if (this.x == o.x) {
                return this.y - o.y;
            }
            return this.x-o.x;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Point[] arr = new Point[n];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr[i] = new Point(x, y);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //[Point{x=1, y=2}, Point{x=1, y=3}, Point{x=2, y=5}, Point{x=2, y=7}, Point{x=3, y=6}]
    }
}
