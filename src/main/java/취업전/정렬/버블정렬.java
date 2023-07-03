package 취업전.정렬;

import java.util.Arrays;
import java.util.Scanner;

public class 버블정렬 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=kb.nextInt();

        //i가 0일 때는 맨뒤의 가장 큰수를 구하는 for문이 된다.
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.println(i+" "+ j);
                if(arr[j]>arr[j+1]){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
                System.out.println(Arrays.toString(arr));
            }
        }
    }
}
