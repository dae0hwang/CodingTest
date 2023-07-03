package 취업전.배열;

import java.util.Arrays;
import java.util.Scanner;

public class 등수구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int[] answer = new int[n];
        for(int i=0; i<n; i++){
            int cnt=1;
            for(int j=0; j<arr.length; j++){
                if(arr[j]>arr[i]) cnt++;
            }
            answer[i]=cnt;
        }
        System.out.println(Arrays.toString(answer));
    }
}
