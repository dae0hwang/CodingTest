package 복습;

import java.util.Scanner;

public class 뒤집은소수2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = 910;
        int result = 0;
        while (test != 0) {
            result *= 10;
            int n = test % 10; //0
            result += n;
            test /= 10;
        }
        System.out.println(result);
        System.out.println(isPrime(2));
        System.out.println(isPrime(4));
        System.out.println(isPrime(22));
    }

    public static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
