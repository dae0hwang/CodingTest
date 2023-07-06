package 알고리즘복습;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Least캐시 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] cache = new int[size];
        for (int x : arr) {
            int pos = -1;
            for (int i = 0; i < size; i++) {
                if (x == cache[i]) {
                    pos = i;
                }
            }

            //만약 히트된 값이 없다면 1번 인덱스부터 오른쪽으로 이동한다.
            if (pos == -1) {
                for (int i = size-1; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
                cache[0] = x;
            } else {
                //만약 있다면
                //1번 인덱스부터 히트된 위치까지 오른쪽으로 이동한다.
                for (int i = pos; i >= 1; i--) {
                    cache[i] =cache[i - 1];
                }
                cache[0] = x;
            }
        }
        System.out.println(Arrays.toString(cache));
    }

}
