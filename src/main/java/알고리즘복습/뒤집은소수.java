package 알고리즘복습;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.script.ScriptContext;

public class 뒤집은소수 {

    static int n;
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> list = new ArrayList<>();

        for (int i : arr) {
            int change = test(i);
            if (check(change)) {
                //참이라면
                list.add(change);
            }
        }
        for (Integer integer : list) {
            System.out.print(integer+" ");
        }


    }

    public static int test(int a) {
        Integer answer = 0;
        while (a > 0) {
            int least = a % 10;
            answer = answer * 10 + least;
            a = a / 10;
        }
        return answer;
    }

    public static boolean check(int a) {
        //소수 인지 체크하기
        int b = a / 2 + 1;
        boolean flag = true;
        for (int i = 3; i <= b; i++) {
            if (a % i == 0) {
                flag = false;
            }
        }
        return flag;
    }

}
