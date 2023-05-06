package 복습;

import java.util.Scanner;

public class 캐시메모리2 {

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
            //먼저 히트된 값을 찾는다.
            int hit = -1;
            for (int i = 0; i < cache.length; i++) {
                if (x == cache[i]) {
                    //히트된 자리수를 찾는다 캐시 내부에
                    hit = i;
                }
            }

            if (hit == -1) {
                //히트된 값이 없다면
                //캐시 0부터 오른쪽한칸씩 이동한다.
                for (int i = cache.length - 1; i >= 1; i--) {
                    arr[i] = arr[i - 1];

                }
                cache[0] = x;
            } else {
                //히트된 위치가 이싿.
                for (int i = hit; i >= 1; i--) {

                    arr[i] = arr[i - 1];
                }
                cache[0] = x;
            }
        }

    }

}
