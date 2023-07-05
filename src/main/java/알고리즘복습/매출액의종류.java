package 알고리즘복습;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class 매출액의종류 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n-k+1; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = 0; j < k; j++) {
                set.add(arr[i + j]);
            }
            answer.add(set.size());
        }
        System.out.println(answer);

    }

}
