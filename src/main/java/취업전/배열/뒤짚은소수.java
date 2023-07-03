package 취업전.배열;

import java.util.Scanner;

public class 뒤짚은소수 {

    public static boolean isPrime(int num) {
        if(num==1) return false;
        for(int i=2; i<num; i++){
            if(num%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int tmp : arr) {
            //뒤짚은 수 구하기 이 부분이 핵심이다.
            int res = 0;
            while (tmp > 0) {
                int t = tmp % 10;
                res = res * 10 + t;
                tmp = tmp / 10;
            }
            if (isPrime(res)) {
                System.out.print(res+" ");
            }
        }
    }
}
