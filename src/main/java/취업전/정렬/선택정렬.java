package 취업전.정렬;

import java.util.Arrays;
import java.util.Scanner;

public class 선택정렬 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++) arr[i]=kb.nextInt();
        for(int i=0; i<n-1; i++){
            int idx=i;
            //찾고자 하는 인덱스보다 +1값부터
            //가장 작은 수를 찾는다. 그리고 그 값을
            //해당 인덱스와 교환한다.
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[idx]) idx=j;
            }
            int tmp=arr[i];
            arr[i]=arr[idx];
            arr[idx]=tmp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
