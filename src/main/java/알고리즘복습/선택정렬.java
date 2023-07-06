package 알고리즘복습;

import java.util.Arrays;

public class 선택정렬 {

    public static void main(String[] args) {
        int n = 6;
        int[] arr = new int[]{13, 5, 11, 7, 23, 15};

        for (int i = 0; i < arr.length-1; i++) {
            int idx = i;
            //0번 인덱스부터 더큰 인덱스 중에 가장 작은 수를 찾아서 바꾼다.
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[idx]) {
                    idx = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }
        System.out.println(Arrays.toString(arr));

    }
}
