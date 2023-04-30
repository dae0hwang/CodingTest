package 정렬;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LeastRecentlyUsed {
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
            //먼저 히트 값이 있는 지 찾는다.
            for (int i = 0; i < size; i++) {
                if (x == cache[i]) {
                    pos = i;
                }
            }
            //만약 히트 된 값이 없다면 cache[0] = 새로운 값 x를 넣어주고
            // 1번 인덱스 부터 오른쪽으로 이동한다.
            // 그러면 5번 인덱스는 size 밖으로 나가서 사라진다.
            if (pos == -1) {
                for (int i = size - 1; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
                cache[0] = x;
            } else {
                //만약 히트된 값이 있다면
                //1번 인덱스부터 히트된 위치까지 오른쪽으로 이동한다
                for (int i = pos; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
                cache[0] = x;
            }
        }
        System.out.println(Arrays.toString(cache));
    }
}
