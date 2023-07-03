package 취업전.배열;

import java.util.Arrays;
import java.util.Scanner;

public class 임시반장구하기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n + 1][6];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }

        int answer = 0, max = 0;
        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= 5; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        cnt++;
                        //한번 같은 반 되었으면 그만 센다. 3번학생과 4번 학생이 2학년에서 같아서 cnt++
                        //해주었는데, 3학년까지 같아서 cnt++ 또해주면 안되니깐
                        //i번 j번 학생이 같은 것을 한번 확인 했으면 break 걸어준다.
                        break;
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                answer = i;
            }
        }
        System.out.println(answer);
    }
}
