package 알고리즘복습;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 멘토링 {
    static int n, m;
    static int[][] arr;
    static int[] dis;
    static int[] ch;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        dis = new int[2];
        ch = new int[n + 1];
        arr = new int[n+1][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
//                arr[j+1][i] = sc.nextInt();
                int gogo = sc.nextInt();
                arr[gogo][i] = j + 1;
            }
        }
//        System.out.println(Arrays.deepToString(arr));
        //각 x 열인덱스로 각 학생 각 시험별 등수 얻게 되었다.
        DFS(0);
    }

    public static void DFS(int V) {
        if (V == 2) {
            //0부터 시작해서
            System.out.println(Arrays.toString(dis));
            //각 조합을 구했다. 완성했다.
            int x = dis[0];
            int y = dis[1];
            int[] xx = arr[x];
            int[] yy = arr[y];
            boolean flag = true;
            for (int i = 0; i < xx.length; i++) {
                if (xx[i] > yy[i]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(x+" "+y);
            }
        } else {
            //순열 구해보자 중복 없는 것으로
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    dis[V] = i;
                    DFS(V+1);
                    ch[i] = 0;
                }
            }
        }
    }
}
