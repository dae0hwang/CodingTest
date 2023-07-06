package 알고리즘복습;

import java.util.Arrays;

public class 버블정렬 {

    public static void main(String[] args) {
        int n = 6;
        int[] arr = new int[]{13, 5, 11, 7, 23, 15};
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
