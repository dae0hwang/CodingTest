package 복습;

import java.util.ArrayList;
import java.util.Scanner;

public class 두배열합치기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int p1 = 0, p2 = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (p1 < n1 && p2 < n2) {
            if (arr1[p1] < arr2[p2]) {
                list.add(arr1[p1]);
                p1++;
            } else {
                list.add(arr2[p2]);
                p2++;
            }
        }
        while (p1 < n1) {
            list.add(arr1[p1]);
            p1++;
        }

        while (p2 < n2) {
            list.add(arr2[p2]);
            p2++;
        }
        System.out.println(list);

    }

}
